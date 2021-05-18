## BitLabs Android SDK

[![](https://jitpack.io/v/BitBurst-GmbH/bitlabs-android-library.svg)](https://jitpack.io/#BitBurst-GmbH/bitlabs-android-library)

Official Android SDK for BitBurst's BitLabs. We have an example app that can be used for
reference on how to integrate this SDK. Take a look at `/example` for more details.

Read the complete documentation here: https://bitlabs.ai/integrations/android-sdk

### Dependencies

Add the following above the __dependencies__ section of your app level build.gradle file:
```
repositories {
    maven {
        url 'https://jitpack.io'
    }
}
```

Then add the dependency in the same file:
```
dependencies {
    // other dependencies

    implementation 'com.github.BitBurst-GmbH:bitlabs-android-library:1.1.10'

    // other dependencies
}
```

### Usage

The BitLabs SDK has to be initialized with your app token and a unique id for the active
user.

Use `BitLabsSDK.init(<context>, "YOUR-TOKEN", "YOUR-USER-ID");` to initialize the SDK.

With `BitLabsSDK.surveyAvailable();` you can check if a survey is available for the user.

With `BitLabsSDK.show(<context>);` you can open our preconfigured web activity which shows
your offerwall.

If your call the BitLabs SDK from a __Java__ file, please use `BitLabsSDK.Companion.init()`, using __Kotlin__ `BitLabsSDK.init()` is fine.
