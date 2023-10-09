// Generated by Dagger (https://dagger.dev).
package com.example.feature.login;

import com.example.core.common.user.UserManager;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class LoginViewModel_Factory implements Factory<LoginViewModel> {
  private final Provider<UserManager> userManagerProvider;

  public LoginViewModel_Factory(Provider<UserManager> userManagerProvider) {
    this.userManagerProvider = userManagerProvider;
  }

  @Override
  public LoginViewModel get() {
    return newInstance(userManagerProvider.get());
  }

  public static LoginViewModel_Factory create(Provider<UserManager> userManagerProvider) {
    return new LoginViewModel_Factory(userManagerProvider);
  }

  public static LoginViewModel newInstance(UserManager userManager) {
    return new LoginViewModel(userManager);
  }
}