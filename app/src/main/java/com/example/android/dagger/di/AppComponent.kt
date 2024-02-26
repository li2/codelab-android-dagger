/*
 * Copyright (C) 2019 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.android.dagger.di

/*
// Scope annotation that the AppComponent uses
// Classes annotated with @Singleton will have a unique instance in this Component
@AppScope
// Definition of a Dagger component that adds info from the different modules to the graph
@Component(
    modules = [
        AndroidInjectionModule::class, // to ensure that all bindings necessary for these base types are available.
        // Hilt migration: migrated via @AndroidEntryPoint
        ActivityModule::class,
        // Hilt migration: migrated via @ApplicationContext
        ContextModule::class,
    ],
    // Hilt migration: migrated via predefined SingletonComponent
    dependencies = [CoreComponent::class],
)
interface AppComponent : AndroidInjector<DaggerApplication> {

    @Component.Builder
    interface Builder {
        fun contextModule(contextModule: ContextModule): Builder
        fun coreComponent(coreComponent: CoreComponent): Builder
        fun build(): AppComponent
    }

    // Hilt migration: migrated via EntryPoint
    fun inject(baseTaskInjector: BaseTaskInjector)
}
*/
