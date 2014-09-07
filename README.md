YetAnotherTextView
==================

Yet another TextView which allows you to set the custom typeface from application's theme as well as from xml.

after including `YetAnotherTextView` as a library to your project use 

<radix2.yat.widget.TextView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        app:ttfName="Roboto-Thin.ttf" />

instead of this,

<TextView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"/>

and provide namespace for app as `xmlns:app="http://schemas.android.com/apk/res/<your-app-package>"`

if you want to apply typeface from theme, it's prety much easy. just provide style for radix2.yat.widget.TextView as;

<style name="AppBaseTheme" parent="android:Theme.Light">
  <item name="TextViewStyle">@style/TextView</item>
</style>

<style name="TextView" parent="@android:style/Widget.TextView">
  <item name="ttfName">Roboto-BoldItalic.ttf</item>
</style>

make sure Roboto-BoldItalic.ttf is present under assests folder.
