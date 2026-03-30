# Social Sparks

A simple Android app that suggests what messege to prompt based on the time of day. 

## Features

- Enter a time of day (e.g. Morning, Afternoon, Night) to get a food suggestion
- Clear button to reset the input and output
- Custom background image with a fun theme of the viral "Cheating Fruits" to enlighten your day
  
## Supported Time Inputs

| Input              | Suggestion                     |
|--------------------|--------------------------------|
| Morning            | Goodmorning my beautiful fam   |
| Mid-morning        | Thank you happy coworker       |
| Afternoon          | What the dog doing             |
| Afternoon Snack Time | Thinking of you my sweetheart|
| Dinner             | Calling Joe Barber             |
| After Dinner       | Looking stunning queen         |
| Night              | Such a sweet smile my angel    |

> Inputs are case-sensitive. If the input doesn't match any of the above, the app will display "I don't know that time".

## Tech Stack

- **Language:** Kotlin
- **UI:** XML Layouts (LinearLayout)
- **Min SDK:** 24 (Android 7.0)
- **Target SDK:** 34 (Android 14)
- **Build System:** Gradle with Kotlin DSL

## Project Structure

```
app/
└── src/
    └── main/
        ├── java/com/example/assignment_1_new/
        │   └── MainActivity.kt       # Main activity logic
        ├── res/
        │   ├── drawable/
        │   │   └── cheating_fruits.png  # Background image
        │   ├── layout/
        │   │   └── activity_main.xml    # UI layout
        │   └── values/
        │       ├── strings.xml
        │       ├── colors.xml
        │       └── themes.xml
        └── AndroidManifest.xml
```

## Getting Started

### Prerequisites

- Android Studio (latest stable recommended)
- Android SDK 34
- JDK 11+

### Running the App

1. Clone or extract the project.
2. Open the project in Android Studio.
3. Let Gradle sync and download dependencies.
4. Run the app on an emulator or physical device running Android 7.0 (API 24) or higher.

##YouTube Link
https://youtube.com/shorts/FrOlr1sZ-o4?feature=share


   
