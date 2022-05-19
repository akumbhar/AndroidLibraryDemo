# This is demo library project



## How to integrate library?

**Step 1.** Add the JitPack repository to your build file

Add it in your root **build.gradle** or **settings.gradle** at the end of repositories

    allprojects {
		repositories {
			maven { url 'https://jitpack.io' }
		}
	}
**Step 2.** Add the dependency

    dependencies {
	        implementation 'com.github.akumbhar:AndroidLibraryDemo:1.2.0'
	}
