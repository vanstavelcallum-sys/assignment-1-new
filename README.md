# Buttered Buns 🍞

A simple Android app that suggests food based on the time of day. Built as Assignment 1 using Kotlin and Android Views.

## Features

- Enter a time of day (e.g. Morning, Afternoon, Night) to get a food suggestion
- Clear button to reset the input and output
- Custom background image with a fun "Buttered Buns – Food made with Love" theme

## Supported Time Inputs

| Input              | Suggestion              |
|--------------------|-------------------------|
| Morning            | Eat some Wagon Wheels   |
| Mid-morning        | Time for second breakfast |
| Afternoon          | Maybe a sandwich?       |
| Afternoon Snack Time | Cookies!              |
| Dinner             | Steak and potatoes      |
| After Dinner       | Dessert time            |
| Night              | Midnight snack          |

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
