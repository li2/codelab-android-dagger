package com.example.android.dagger.di;

import com.example.android.dagger.settings.SettingsActivity;
import com.example.android.dagger.user.LoggedUserScope;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(subcomponents = ActivityModule_SettingsActivity.SettingsActivitySubcomponent.class)
public abstract class ActivityModule_SettingsActivity {
  private ActivityModule_SettingsActivity() {}

  @Binds
  @IntoMap
  @ClassKey(SettingsActivity.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      SettingsActivitySubcomponent.Factory builder);

  @Subcomponent
  @LoggedUserScope
  public interface SettingsActivitySubcomponent extends AndroidInjector<SettingsActivity> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<SettingsActivity> {}
  }
}
