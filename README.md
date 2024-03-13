# Hideout-chat
Lan chat application without internet access using java sockets

# Features
* Change user image
* Online user discovery
* Text messaging  
* Voice message
* Pictures and file transfer
* Messages will vanish after the session.

# Technologies 
* Java 
* Android studio
* Socket

# Technical Details

1) User A opens the program, select a name and avatar, click login, start landing on the local area network, user A login program will start two threads at the same time,  one thread inside the UDP service terminal (port number) 9156), used to wait for other users to log in, another thread inside to start the TCP service side (port number 9155), to wait for other users' Socket connection, at the same time user A will also use UDP broadcast a UDP package out. This UDP package contains information such as the user's name and ip address, and the UDP package is sent to all UDP service-side programs with the same port within the same local area network, including this program.

2) If there are other online users, then each online user program UDP service side will receive this UDP package, and then take out the user information and add user A to the online list, because the UDP package contains the user A ip address, so each online user uses user A's ip address to send a reply to user A.

3)  User A waits for a while, they will receive replies from all online users, and then all online users will add User A to their own online list.

chatting method is as usual multi threaded way where two devices act as server, we can say it is a p2p app.


# Demo
<img src="https://user-images.githubusercontent.com/43814196/135754848-0a2da82e-1c1c-439c-8497-db6c33268c47.png" width="360" height="600" />   <img src="https://user-images.githubusercontent.com/43814196/135754849-736ce41c-d878-4902-bcc0-aeecffbc430b.png" width="360" height="600" />

<img src="https://user-images.githubusercontent.com/43814196/135754846-311b2f45-8fa5-4b72-8677-3ec6f57ebf7b.png " width="360" height="600" />   <img src="https://user-images.githubusercontent.com/43814196/135754847-c6e4e104-e9a3-486a-acb8-b6b40bf9b532.png" width="360" height="600" />   


