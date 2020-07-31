package kr.smartscore.gplace.config;


import kr.smartscore.gplace.domain.common.code.RoleType;
import kr.smartscore.gplace.domain.common.code.place.*;
import kr.smartscore.gplace.domain.common.code.enumMapper.EnumMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import java.util.Set;
import java.util.HashSet;
import java.net.URL;
import java.io.File;
import java.lang.reflect.Modifier;
@Configuration
public class EnumConfig {
    @Bean
    public EnumMapper enumMapper() {
        EnumMapper enumMapper = new EnumMapper();
        enumMapper.put("RoleType", RoleType.class);

        Set<Class> classes = getClasses("kr.smartscore.gplace.domain.common.code.place");
        classes.forEach((e) -> { enumMapper.put(e.getSimpleName(), e); });


        return enumMapper;
    }

    private static Set<Class> getClasses(String packageName){
        Set<Class> classes = new HashSet<Class>();
        String packageNameSlash = "./" + packageName.replace(".", "/");
        URL directoryURL = Thread.currentThread().getContextClassLoader().getResource(packageNameSlash);
        if(directoryURL == null){
            System.err.println("Could not retrive URL resource : " + packageNameSlash);
            return null;
        }

        String directoryString = directoryURL.getFile();
        if(directoryString == null){
            System.err.println("Could not find directory for URL resource : " + packageNameSlash);
            return null;
        }

        File directory = new File(directoryString);

        if(directory.exists()){
            String[] files = directory.list();
            for(String fileName : files){
                if(fileName.endsWith(".class")){
                    fileName = fileName.substring(0, fileName.length() - 6);  // remove .class
                    try{
                        Class c = Class.forName(packageName + "." + fileName);
                        if(!Modifier.isAbstract(c.getModifiers())) // add a class which is not abstract
                            classes.add(c);
                    } catch (ClassNotFoundException e){
                        System.err.println(packageName + "." + fileName + " does not appear to be a valid class");
                        e.printStackTrace();
                    }
                }
            }
        } else {
            System.err.println(packageName + " does not appear to exist as a valid package on the file system.");
        }

        return classes;
    }
}
