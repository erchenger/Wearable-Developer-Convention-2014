Wearable Developer Convention 2014
==================================

This repo will be the home to both the Glassware and Pebble apps for the Wearable Developer Convention to help attendees view the schedule on their favorite wearable device. Forgive me (Elliott) for creating the Glassware with Eclipse and not Android Studios. We did this in a short amount of time and I am not fully switched over to AS yet. 

# Updates
Because the Glassware is not distributed through the Glassware Store please watch this repo or follow the twitter accounts located under the Developed By heading for any updates to the Glassware. 

# Installation

## Glass
1. Download the [latest (V1.1.2)](https://github.com/erchenger/Wearable-Developer-Convention-2014/tree/master/Glassware%20APK/Glass-WDC-2014-v1.1.2.apk) version of the APK from the Glassware APK folder in this repo.

2. To install the Glassware onto your Google Glass you need to have first installed the [Android Developer Tools](http://developer.android.com/sdk/installing/bundle.html). Once you have installed the ADT you need to use Android Device Bridge (ADB) to install the glassware. 

3. Simply open a terminal and type the following into the terminal (note if you haven't added ADB as a part of your class path you will need to navigate to where it was installed or add it to your class path)

```
adb install path/to/the/Glass-WDC-2014-vX.X.apk 
```
NOTE: Also make sure and change the "vX.X" with the version of the apk you downloaded. As well if you had previously loaded the glassware and are updating you will need to run the following command before installing the new glassware.

```
adb uninstall com.elliott.chenger.wearabledeveloperconference2014
```

## Pebble

The easiest way to install the Pebble app is simply to use the Pebble App Store, where it's listed as "WDC 2014 Schedule". You can also find it on [mypebblefaces.com](http://www.mypebblefaces.com/apps/2509/10559/) or (of course) build and install it yourself from the source.

#JSON Formatting
##Time
This is the format for the Time JSON, which we use to tell what time slots occur on a certain day for the events.
```json
{
    "date": 1393999200000,
    "times": [
        {
            "startTime": 1393358543084,
            "endTime": 1393358543084
        },
        {
            "startTime": 1393358543084,
            "endTime": 1393358543084
        }
    ]
}
```
##Event 
This is the formate for the Event JSON, which we use to tell what events are happening on a certain day at a certain time.
```json
{
    "date":1393999200000,
    "events": [
        {
            "title": "Glass Development Class",
            "speaker": "Elliott Chenger",
            "startTime": 1393358543084,
            "endTime": 1393358543084,
            "type": "class",
            "level": "overview"
        },
        {
            "title": "Pebble Development Class",
            "speaker": "Sean McMains",
            "startTime": 1393358543084,
            "endTime": 1393358543084,
            "type": "tutorial",
            "level": "intermediate"
        },
        {
            "title": "Other Development Class",
            "speaker": "Bugs Bunny",
            "startTime": 1393358543084,
            "endTime": 1393358543084,
            "type": "class",
            "level": "Advanced"
        },
        {
            "title": "Keynote",
            "speaker": "Daffy Duck",
            "startTime": 1393358543084,
            "endTime": 1393358543084,
            "type": "keynote"
        },
        {
            "title": "Fireside Chat",
            "speaker": "Red Ranger",
            "startTime": 1393358543084,
            "endTime": 1393358543084,
            "type": "special"
        }
    ]
}
```

##Developed By
- [Elliott Chenger](https://twitter.com/Echenger)
- [Sean McMains](https://twitter.com/SeanMcTex)

