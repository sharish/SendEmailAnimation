# Send Email Animation

This is a small attempt to attract users when they are using in app feature to send out an email. The usage of this repo serves the purpose like contacting the support desk, inviting another user over email or any other form of email based features.

##### Why to use?

- An user having used multiple applications is bored to see the traditional loading indicator, would always prefer to see something new and providing such user experience helps to retain users. 

- There are cases where users may not like the idea of taking them to email client app(passing an SEND_TO action intent) since the users do not like to promote an app feature from his direct email account. 

- More often users do not return to the origin application that took him to email client app as they become busy reading the other emails - leads to fall in user engagement.

##### How to Use?

Very simple - Have a button in your activity and click listener to call the following call:

```java
startActivity(new Intent(YourActivity.this,EnvelopeActivity.class));
```

The above will take the user to email client app for sending out an email. (I suggest not to use this because of last two reasons mentioned in 'Why to use' section.)

For handling the emails within the app:

```java
startActivityForResult(new Intent(YourActivity.this,EnvelopeActivity.class), SOME_INTENT_REQUEST_CODE);
```

Have overriding onActivityResult in your calling activity to get the email subject and message part that you can use in your own app. (Refer MainActivity.java to check how to do that)


Note: Email subject and message field validations are not done, it is left to your choice of handling and you are free to edit the source.

##### How it looks?

![sendemailanimation](https://cloud.githubusercontent.com/assets/13122232/10564092/9f6f8be0-75c3-11e5-94bd-801aef62c529.gif)


##### LICENSE:

You are free to use, copy, edit and the repo is provided under [MIT LICENSE](https://github.com/cooltechworks/ContactSupportAnimation/blob/master/LICENSE)

