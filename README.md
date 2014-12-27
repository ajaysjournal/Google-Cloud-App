Google-Cloud-App
================

This Contains Working Example of "App Engine Backend with Google Cloud Messaging" Template 
https://github.com/GoogleCloudPlatform/gradle-appengine-templates

This Project contains 3 Backends which are deployed in google app engine.

Say Version 1 contains java servlet backend
  http://1-dot-logical-flame-807.appspot.com/

Say Version 2 contains endpoints backend
  http://2-dot-logical-flame-807.appspot.com/

Say Version 3 contains google cloud messaging backend
  http://3-dot-logical-flame-807.appspot.com/
  

All these backends are called from android app in onCreate of main activity java .
 
        //Servlet Call
        new ServletPostAsyncTask().execute(new Pair<Context, String>(this, "Ajay Ramesh"));

        //Endpoint call
        new EndpointsAsyncTask().execute(new Pair<Context, String>(this, "Ajay Ramesh "));

        //Gcm Registration
        new GcmRegistrationAsyncTask(this).execute();
        
        
  Todos to work for you app ..
  
  1.Change the applicationid in 
      1.EndpointsAsyncTask 
      2.ServletPostAsyncTask
      3.GcmRegistrationAsyncTask
  
  2.Change the SENDER_ID in GcmRegistrationAsyncTask
  
  3.Add the GCM key to appengine-web.xml
   <property name="gcm.api.key" value="YourPublicKey" />
   \Google-Cloud-App\gcm-backend\src\main\webapp\WEB-INF\appengine-web.xml

  
  Watch this tutorial for step by step setup http://youtu.be/EzGgdyZIsMk
  
