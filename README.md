Introduction to Mobile Application Development (5112) – Assignment 2
### Introduction 
In this assignment, we have been tasked with creating a Tamagotchi application which features a home screen, which welcomes to user, and a secondary screen which the user can play the game on. The interactions which the user can have with the virtual pet are; feeding, cleaning and playing. While the user is interacting with the “pet”, they must keep an eye out on the health score of the pet to ensure that it stays alive and healthy. 
Purpose of the Application 
The purpose of this particular android application is to create long-lasting entertainment for the user, as they are given the responsibility to take care of their virtual pet, with regard of making sure that the “pet” is fed, cleaned and entertained. If the user does not take good care of the “pet” and its health score gets too low, this will ultimately lead to the pet dying and the user having to start all over again. If the user of the android application does indeed keep a close eye on the pet and takes care of it, the app will just keep running.
This android application’s story is based around the Disney character, Donald Duck. He is the subject in all the images which appear in the application. When the user clicks on either the feed, clean or play buttons, they will be able to see a corresponding image with an action related to the task which they are trying to perform. The corresponding images are, an image of Donald Duck preparing to eat, an image of Donald Duck about to step under the water of a shower and an image of Donald Duck bouncing a basketball.  
Ultimately, this application provides users with a fun and interactive way to pass the time while fostering a sense of responsibility and attachment to their virtual pet. Whether users succeed in maintaining their pet's health or face the consequences of neglect, the journey of caring for Donald Duck is sure to provide hours of enjoyment and entertainment.
Application’s Design 
The design of this application is meant to be simple, intuitive and easy to comprehend.
The colours used also follow the same principal as the design of the application as the colours are playful and youthful as the aim is to make the android application as appealing as possible to a large population, in order to make it fun for all people wanting to play. Examples of these colours can be seen in the title and colours of the buttons. 
The font of the text displayed throughout the application is meant to be bold and easy to read as the aim is for the application to target a widely spread audience.
As the application is running, the user will first see the welcome screen with a heading that reads “Welcome to Donald Duck’s Tamagotchi App” in a bright yellow colour. Under that is a large image of Donald Duck exited and seeming to welcome the user to the android application. Thereafter, are two button where one leads the user to the next page and the other takes the user out of the application. 
Once the user is on the second screen, they are again greeted by an exited Donald Duck and under his image are the three buttons; feed, play and clean. These are the buttons which the user is going to be interacting which as they are the buttons which control the actions of the application. 
As the user of the android application clicks on these buttons, not only will the scores be affected, but also the picture at the very top. The images will change according to the task which the user wishes for the applications to perform.
Underneath the three buttons are the scores of each individual category. These categories are labelled, “Hunger Points”, “Playing Points” and “Cleaning Points”. 
Lastly, the is a notification panel which will inform the user of the current actions which are taking place. 
In conclusion, the design of the Donald Duck Tamagotchi App is crafted with simplicity, intuitiveness, and broad appeal in mind. The use of playful and youthful colors throughout the application, from the title to the buttons, aims to create an inviting and enjoyable experience for users of all ages. 
Upon launching the application, users are greeted by a welcoming screen featuring Donald Duck, inviting them into the virtual world of pet care. Transitioning to the main screen, users encounter Donald Duck again, alongside the primary interactive buttons for feeding, playing, and cleaning. Overall, the Donald Duck Tamagotchi App offers a delightful and engaging experience, blending simplicity, vibrant design, and interactive features to captivate users and provide hours of entertainment.
### Source Code from Android Studio 
![1](https://github.com/ST10444570/Tamagotchi-App/assets/161335944/666b9e43-ad3d-4144-b450-fbf05ec6b420)

 Figure 1: Source Code for First Screen 
 ![2](https://github.com/ST10444570/Tamagotchi-App/assets/161335944/98bba57d-be3d-4e0c-9c4d-3606c41423be)

 Figure 2: Source Code for First Screen
 ![3](https://github.com/ST10444570/Tamagotchi-App/assets/161335944/6c0afacb-0548-449b-9497-9914e9f03d7f)

 Figure 3: Source Code for Second Screen 
 ![4](https://github.com/ST10444570/Tamagotchi-App/assets/161335944/31fa7b98-30ed-4b26-ae6b-ce031bfdc1db)

 Figure 4: Source Code for Second Screen
 ![5](https://github.com/ST10444570/Tamagotchi-App/assets/161335944/03d38b61-7cdb-43e8-b262-dfbfb0982534)

 Figure 5: Source Code for Second Screen 
### Design View from Android Studio
![6](https://github.com/ST10444570/Tamagotchi-App/assets/161335944/eac025b3-86f1-4003-89d1-0e5585133f1e)

 Figure 6: Design Screen for First Screen
 ![7](https://github.com/ST10444570/Tamagotchi-App/assets/161335944/a93815c3-6087-4b4d-bca5-e6e95dacb9bf)

Figure 7: Design Screen for Second Screen





### Utilisation of GitHub and GitHub Actions
1. name: This is the name of the workflow that appears on GitHub when the action is run.

2. env: These are environment variables accessible to all jobs and steps in the workflow. In this case, main_project_module is set to app, and playstore_name is set to IIECat.

3. on: This section defines the events that will trigger the workflow. In this case, the workflow will run when thereâ€™s a push to the release branch or when the workflow is manually triggered from the Actions tab (workflow_dispatch).

4. jobs: This section contains all the jobs that will be run in the workflow. In this case, thereâ€™s only one job named build.

5. runs-on: This specifies the type of machine to run the job on. Here, itâ€™s set to run on the latest version of Ubuntu.

6. steps: These are the individual tasks that make up a job. 
   Each step can run commands (run:), run setup tasks (uses:), or 
   set job-level environment variables. 	
   The steps include checking out the repository; 
	- setting up Java, 
	- running tests, 
	- building the project, 
	- creating APKs and AABs, and 
	- uploading the build artifacts to GitHub.

7. uses: This is used to include external actions. For example, actions/checkout@v3 checks out your repository onto the runner, and actions/setup-java@v3 sets up a JDK environment for use in actions.

8. with: This is used to specify inputs for the uses: steps.

9. run: This is used to run command-line programs using the operating systemâ€™s shell.
   
### References
Lephoto, T. 2024. Source Code for First Screen. [Photograph] [Personal Collection]. Unpublished.
Lephoto, T. 2024. Source Code for First Screen. [Photograph] [Personal Collection]. Unpublished.
Lephoto, T. 2024 Source Code for Second Screen. [Photograph] [Personal Collection]. Unpublished.
Lephoto, T. 2024. Source Code for Second Screen. [Photograph] [Personal Collection]. Unpublished.
Lephoto, T. 2024. Source Code for Second Screen. [Photograph] [Personal Collection]. Unpublished.
Lephoto, T. 2024. Design Screen for First Screen. [Photograph] [Personal Collection]. Unpublished.
Lephoto, T. 2024. Design Screen for Second Screen. [Photograph] [Personal Collection]. Unpublished.

https://advtechonline-my.sharepoint.com/personal/st10444570_vcconnect_edu_za/_layouts/15/stream.aspx?id=%2Fpersonal%2Fst10444570%5Fvcconnect%5Fedu%5Fza%2FDocuments%2FRecording%2D20240507%5F234023%2Ewebm&nav=%7B%22defaultNavPanel%22%3A%7B%22pluginName%22%3A%22MediaSettingsLayer%22%7D%7D&referrer=StreamWebApp%2EWeb&referrerScenario=AddressBarCopied%2Eview%2E949c9065%2D77f3%2D4068%2Da9cc%2Ddb9b3db633ee
