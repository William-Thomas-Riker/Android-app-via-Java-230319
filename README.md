# Android-app-via-Java-230319

Draght code, testing one of Android apps. It somehow works.  
Under constructing.

## Some points:
- Android Studio Bumblebee | 2021.1.1 Patch 1
Build #AI-211.7628.21.2111.8139111

- 2 way data binding
- @InverseMethod
- extention of BaseObservable  
    Instead of implementing a 'ViewModel', the data for data binding were provided by members of a subclass of 'BaseObservable'.
    As a result, it was possible to prevent any loss of display even when the screen was rotated.
- IME optional listener  
    When you press the 'NEXT' button, the input value will be aligned to two decimal places.
- fit out with 'ScrollFiew'
- redundant codes are left 
