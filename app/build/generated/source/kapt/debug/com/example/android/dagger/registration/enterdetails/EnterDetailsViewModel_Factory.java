// Generated by Dagger (https://dagger.dev).
package com.example.android.dagger.registration.enterdetails;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class EnterDetailsViewModel_Factory implements Factory<EnterDetailsViewModel> {
  @Override
  public EnterDetailsViewModel get() {
    return newInstance();
  }

  public static EnterDetailsViewModel_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static EnterDetailsViewModel newInstance() {
    return new EnterDetailsViewModel();
  }

  private static final class InstanceHolder {
    private static final EnterDetailsViewModel_Factory INSTANCE = new EnterDetailsViewModel_Factory();
  }
}
