Wearable Developer Convention 2014
==================================

This repo will be the home to both the Glassware and Pebble apps for the Wearable Developer Convention to help attendees view the schedule on their favorite wearable device. 
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
- Elliott Chenger
- Sean McMains
