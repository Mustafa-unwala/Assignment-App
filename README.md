Assignment

This App is an Android application that allows users to log in, retrieve user data from an API, and fetch their current location. The app provides a seamless user experience with features for authentication, data retrieval via API calls, and location fetching using Google Maps SDK.

Features

User authentication with API calls
Fetch user data from an external API
Fetch current location asynchronously
Display location on a map using Google Maps SDK
Ability to enable GPS if it's not enabled
Responsive UI with FloatingActionButton for location fetching
Getting Started
To get started with the User Location App, follow these steps:

Clone the repository to your local machine:
bash
Copy code
git clone https://github.com/yourusername/assignment-app.git
Open the project in Android Studio.

Build and run the project on an emulator or a physical device.

Grant location permissions when prompted.

Use the login functionality to authenticate with the API and retrieve user data.

Click on the FloatingActionButton to fetch your current location.

If GPS is not enabled, the app will prompt you to enable it.

Once the location is fetched, it will be displayed on the screen.

Prerequisites
Android Studio
Google Play services SDK
Google Maps API key
API endpoint for user authentication and data retrieval
Dependencies
com.google.android.gms:play-services-location - For fetching the user's location.
com.google.android.gms:play-services-maps - For displaying the user's location on a map.
Retrofit - For making API calls and handling network requests.
Gson - For parsing JSON data received from API responses.
Usage
The User Location App is designed to be simple and intuitive to use:

Launch the app on your Android device.
Use the login functionality to authenticate with the API and retrieve user data{"email":"eve.holt@reqres.in"."password":"cityslicka"}.
Click on the FloatingActionButton with the location icon to fetch your current location.
If GPS is not enabled, the app will prompt you to enable it.
Once the location is fetched, it will be displayed on the screen.
Contributing
Contributions are welcome! If you'd like to contribute to the User Location App, please fork the repository and create a pull request with your changes.

Acknowledgements

Google Maps SDK for Android - For displaying maps and fetching location.

Retrofit - For making API calls and handling network requests.

Gson - For parsing JSON data received from API responses.

Android Developer Documentation - For reference and guidance on Android development.
