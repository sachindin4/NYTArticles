# NYT Articles Android App

### App Screenshot
//To be updated

Android app that fetches and displays the most popular articles from The New York Times API. This project is built using Kotlin and follows the MVVM architecture.

### Features
View a list of popular articles.
Click on an article to view its details.

## Getting Started
### Prerequisites
Android Studio <br>
Android Gradle Plugin

### Installation
#### Clone the repository:
git clone https://github.com/yourusername/nyt-articles-android.git <br>
Open the project in Android Studio. <br>
Build and run the app on an emulator or physical device.

### Usage
Launch the app. <br>
The home screen displays a list of popular articles. <br>
Tap on an article to view its details.

### Technologies Used
Kotlin <br>
Android Jetpack Components (ViewModel, LiveData, Navigation) <br>
Retrofit for API requests <br>
Gson for JSON parsing <br>
Material Design Components

### Project Structure
app/src/main/java/com/example/nytarticles: Contains the Kotlin source code. <br>
model: Data classes for articles and responses. <br>
network: API service and Retrofit setup. <br>
repository: Repository for fetching data. <br>
ui: Activities and Fragments. <br>
viewmodels: ViewModels for UI components. <br>
app/src/main/res: Contains resources, including layouts, strings, and drawables. <br>
app/src/main/navigation: Contains the navigation graph (nav_graph.xml) for app navigation. <br>
