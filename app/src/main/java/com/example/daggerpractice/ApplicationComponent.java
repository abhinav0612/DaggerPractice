package com.example.daggerpractice;

import javax.inject.Named;

import dagger.BindsInstance;
import dagger.Component;

/**
 * Created by Abhinav Singh on 02,June,2020
 */
@Component(modules = NetworkModule.class)
public interface ApplicationComponent {
   void inject(MainActivity mainActivity);

   @Component.Builder
      interface Builder{
      @BindsInstance
      Builder userName(@Named("userName") String userName);

      @BindsInstance
      Builder useId(@Named("userId") Integer userId);

      ApplicationComponent build();
      }
}
