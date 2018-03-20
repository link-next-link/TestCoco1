# Objective
- Find out the cause of app crash when pressing “BACK” button on “Cocos2dx Activity”.

- Please try if the crash happens on your device
- Please let me know any hint about the cause of the problem

# Situation
This Android project is created for debugging app crash of cocos2dx activity at pressing BACK button.

This app has "Hybrid” structure with a standard "Android activity" and "Cocos2dx activity".
And users can switch both activities using UI and “BACK” navigation button.

![App Structure](https://github.com/link-next-link/TestCoco1/blob/master/_materials/imgSeq01.jpg "")

I released an app which also has the same “Hybrid” structure but my app user informed me that my app crashes when “BACK” button is pressed.  Unfortunately, in my development environment, the crash does not happen every time and cannot find out the cause of the problem from the debug logs.

That’s why I created this simple project which has only simplified activities with almost no functionality to find out the cause of the crash.

 
# Environment
- **Cocos2d-x 3.15.1**
Cocos2d-x 3.16 is the latest version at this moment but it has another problem.
So that the app still uses the version 3.15.1
- Android Studio 3.0.1
- Android SDK Build-Tools 27.0.3
- Android TargetSDK 26
- Ubuntu 16.04 LTS

# File structure
- Classes : C++ files for cocos2d-x
- Resources : images and fonts for cocos2d-x
- cocos2d : modified files for enabling “BACK” button
- proj.android-studio : Android project files

# How to use
- Clone this project for Android Studio
- Some Cocos2d-x source files have been modified especially for enabling “BACK” button on cocos2d-x activity.  The files are saved under cocos2d/cocos folder.  Overwrite those files on your 
 project.
- Open “proj.android-studio” folder from Android Studio and build it.

# LogCat
```
D/Cocos2dxGLSurfaceView: onKeyDown keyCode=4
D/Cocos2dxGLSurfaceView: onKeyUp keyCode=4
D/cocos2d-x debug info: Exit KeyEscape
D/cocos2d-x debug info: actionFinish start..
D/cocos2d-x debug info: actionFinish done.
D/cocos2d-x debug info: Destructor start..
D/cocos2d-x debug info: Destructor done.
I/Process: Sending signal. PID: 30448 SIG: 9
I/WindowState: WIN DEATH: Window{e23ac3c u0 com.android.app/com.android.app.Activity}
W/WindowManager: Force-removing child win Window{4d9f07d u0 SurfaceView} from container Window{e23ac3c u0 com.android.app/com.android.app.Activity}
D/GraphicsStats: Buffer count: 11
W/WindowManager: Failed looking up window
                    java.lang.IllegalArgumentException: Requested window android.os.BinderProxy@204fe4b does not exist
                                at com.android.server.wm.WindowManagerService.windowForClientLocked(WindowManagerService.java:8743)
                        at com.android.server.wm.WindowManagerService.windowForClientLocked(WindowManagerService.java:8734)
                        at com.android.server.wm.WindowState$DeathRecipient.binderDied(WindowState.java:1209)
                        at android.os.BinderProxy.sendDeathNotice(Binder.java:558)
I/WindowState: WIN DEATH: null
I/WindowState: WIN DEATH: Window{6a5485b u0 com.android.app/com.android.app.MainActivity}
I/ActivityManager: Process com.android.app (pid 30448) has died
D/ActivityManager: cleanUpApplicationRecord -- 30448
W/ActivityManager: Force removing ActivityRecord{9a16ca4 u0 com.android.app/com.android.app.Activity t2649}: app died, no saved state
I/ActivityManager: Start proc 30691:com.android.app/u0a1577 for activity com.android.app/.MainActivity
I/art: Late-enabling -Xcheck:jni
W/art: Failed execv(/system/bin/dex2oat --runtime-arg -classpath --runtime-arg  --debuggable --instruction-set=arm --instruction-set-features=smp,div,atomic_ldrd_strd --runtime-arg -Xrelocate --boot-image=/system/framework/boot.art --runtime-arg -Xms64m --runtime-arg -Xmx512m --instruction-set-variant=krait --instruction-set-features=default --dex-file=/data/app/com.android.app-2/split_lib_slice_9_apk.apk --oat-file=/data/dalvik-cache/arm/data@app@com.android.app-2@split_lib_slice_9_apk.apk@classes.dex) because non-0 exit status
I/InstantRun: starting instant run server: is main process
W/art: Before Android 4.1, method android.graphics.PorterDuffColorFilter android.support.graphics.drawable.VectorDrawableCompat.updateTintFilter(android.graphics.PorterDuffColorFilter, android.content.res.ColorStateList, android.graphics.PorterDuff$Mode) would have incorrectly overridden the package-private method in android.graphics.drawable.Drawable
I/art: Background sticky concurrent mark sweep GC freed 23000(1903KB) AllocSpace objects, 4(80KB) LOS objects, 17% free, 19MB/23MB, paused 6.819ms total 19.143ms
I/MaterialDrawer: updateProfileTheme colInv1=de000000 colInv2=8a000000
I/AppCompatViewInflater: app:theme is now deprecated. Please move to using android:theme instead.
I/MaterialDrawer: updateProfileTheme colInv1=de000000 colInv2=8a000000
D/audio_hw_primary: disable_audio_route: reset and update mixer path: low-latency-playback
D/audio_hw_primary: disable_snd_device: snd_device(2: speaker)
I/DrawerProfile: getView
I/DrawerProfile: getView getTheme
I/DrawerProfile: getView colPrimary=ffaaaaaa
I/DrawerProfile: getView highlite=ffaaaaaa
I/DrawerProfile: getView 1 primaryColor=ffaaaaaa
I/DrawerProfile: getView
I/DrawerProfile: getView getTheme
I/DrawerProfile: getView colPrimary=ffaaaaaa
I/DrawerProfile: getView highlite=ffaaaaaa
I/DrawerProfile: getView 1 primaryColor=ffaaaaaa
D/OpenGLRenderer: Use EGL_SWAP_BEHAVIOR_PRESERVED: true
I/Adreno-EGL: <qeglDrvAPI_eglInitialize:379>: QUALCOMM Build: 10/21/15, 369a2ea, I96aee987eb
I/OpenGLRenderer: Initialized EGL, version 1.4
I/MaterialDrawer: updateProfileTheme colInv1=ffaaaaaa colInv2=ffaaaaaa
W/art: Before Android 4.1, method int android.support.v7.widget.ListViewCompat.lookForSelectablePosition(int, boolean) would have incorrectly overridden the package-private method in android.widget.ListView
I/ListPopupWindow: Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.
W/InputMethodManagerService: Got RemoteException sending setActive(false) notification to pid 30448 uid 11577
I/ActivityManager: Displayed com.android.app/.MainActivity: +3s656ms
I/GoogleInputMethod: onFinishInput() : Dummy InputConnection bound
I/GoogleInputMethod: onStartInput() : Dummy InputConnection bound
E/libEGL: call to OpenGL ES API with no current context (logged once per thread)
V/RenderScript: 0x9c66c000 Launching thread(s), CPUs 4
V/RenderScript: Successfully loaded runtime: libRSDriver_adreno.so
D/MultiStep: _running
D/MultiStep: collectDataCount = 15
I/AppInsightService: collectData - 16, Run Monitoring:true, WiFi On:true - 
I/CpuDataCollector: CpuMonitor.getCpuUsage - Result 50.0 - 
D/MultiStep: end runnable

```


# Licence
none

# Acknowledgement

Thank you very much for your help!
