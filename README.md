## YetAnotherTextView

Yet another TextView which allows you to set the custom typeface from application's theme as well as from xml.

### How to use:
1) Copy the fonts you want to use into the _assets/fonts_ folder of your project

2) Add your application namespace to the root element in the XML file that is to contain YetAnotherTextView's, e.g
```xml
<?xml version="1.0" encoding="utf-8"?>
<RelativeLayout
        xmlns:android="http://schemas.android.com/apk/res/android"
        xmlns:app="http://schemas.android.com/apk/res/radix2.example.app"
		.. >
```  

3) Instead of using
```xml
<TextView ../>
```
use
```xml
<radix2.yat.widget.TextView 
	app:ttfName="FontFileName.ttf" ..> <!-- Where "app" is the namespace defined in step 2 -->
```  

4) You can also provide typeface from theme as;
```xml
<style name="AppBaseTheme" parent="android:Theme.Light">
	<item name="TextViewStyle">@style/TextView</item>
</style>

<style name="TextView" parent="@android:style/Widget.TextView">
	<item name="ttfName">Roboto-BoldItalic.ttf</item>
</style>
```
5) tadaaa!!! 		

#### Version 1.0
* Use custom typefaces using YetAnotherTextView's TextView

### License
	Copyright 2014 Rupesh Sasne

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
