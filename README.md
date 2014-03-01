Wearable Developer Convention 2014
==================================

This repo will be the home to both the Glassware and Pebble apps for the Wearable Developer Convention to help attendees view the schedule on their favorite wearable device. Forgive me (Elliott) for creating the Glassware with Eclipse and not Android Studios. We did this in a short amount of time and I am not fully switched over to AS yet. 

# Installation

## Glass

Elliott will doubtless put interesting things in here.

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
- Sean McMains
