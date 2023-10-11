# NYT Articles Android App

App Screenshot
//To be updated

A simple Android app that fetches and displays the most popular articles from The New York Times API. This project is built using Kotlin and follows the MVVM architecture.

Features
View a list of popular articles.
Click on an article to view its details.

Getting Started
Prerequisites
Android Studio
Android Gradle Plugin

Installation
Clone the repository:
git clone https://github.com/yourusername/nyt-articles-android.git
Open the project in Android Studio.
Build and run the app on an emulator or physical device.

Usage
Launch the app.
The home screen displays a list of popular articles.
Tap on an article to view its details.

Technologies Used
Kotlin
Android Jetpack Components (ViewModel, LiveData, Navigation)
Retrofit for API requests
Gson for JSON parsing
Material Design Components

Project Structure
app/src/main/java/com/example/nytarticles: Contains the Kotlin source code.
model: Data classes for articles and responses.
network: API service and Retrofit setup.
repository: Repository for fetching data.
ui: Activities and Fragments.
viewmodels: ViewModels for UI components.
app/src/main/res: Contains resources, including layouts, strings, and drawables.

app/src/main/navigation: Contains the navigation graph (nav_graph.xml) for app navigation.
