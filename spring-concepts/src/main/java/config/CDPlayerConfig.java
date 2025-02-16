package config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import soundsystem.SidhuMoosewala;

@Configuration
//@ComponentScan(basePackages={"soundsystem"})
@ComponentScan(basePackageClasses={SidhuMoosewala.class})
public class CDPlayerConfig {

}
