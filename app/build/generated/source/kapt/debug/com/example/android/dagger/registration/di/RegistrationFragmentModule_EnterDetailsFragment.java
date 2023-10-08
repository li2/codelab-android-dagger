package com.example.android.dagger.registration.di;

import com.example.android.dagger.di.FragmentScope;
import com.example.android.dagger.registration.enterdetails.EnterDetailsFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents =
      RegistrationFragmentModule_EnterDetailsFragment.EnterDetailsFragmentSubcomponent.class
)
public abstract class RegistrationFragmentModule_EnterDetailsFragment {
  private RegistrationFragmentModule_EnterDetailsFragment() {}

  @Binds
  @IntoMap
  @ClassKey(EnterDetailsFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      EnterDetailsFragmentSubcomponent.Factory builder);

  @Subcomponent
  @FragmentScope
  public interface EnterDetailsFragmentSubcomponent extends AndroidInjector<EnterDetailsFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<EnterDetailsFragment> {}
  }
}
