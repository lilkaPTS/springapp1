package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        //обращение к файлу ресурсов апликейшен контекст и помещает все бины описанные в контекст
        System.out.println("ApplicationContext");
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        System.out.println(context.getBean("testBean", TestBean.class).getName() + "\n");

        System.out.println("Inversion of Control");
        Music music = context.getBean("classicalMusicBean", Music.class);
        MusicPlayer musicPlayer = new MusicPlayer(music);
        musicPlayer.playMusic();
        musicPlayer = new MusicPlayer(context.getBean("rockMusicBean", Music.class));
        musicPlayer.playMusic();
        context.close();
    }
}
