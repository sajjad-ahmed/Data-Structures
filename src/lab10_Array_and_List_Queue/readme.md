# Program
You have to implement a waiting room management system in an emergency ward of a hospital.  Your program will assign an Id number to a patient in a first come first serve basis. The lower the id, the sooner the service will be provided to the patient.
 
Your program will contain the following methods:
 
## RegisterPatient(): 
This method assigns an Id (which is auto-generated) to a patient and register him/her to the system.
## ServePatient():
This method calls a patient to provide hospital service to him/her.
## CancelAll():
This method cancels all appointments of the patients so that the doctor can go to lunch.
## CanDoctorGoHome():
This method returns true if no one is waiting, otherwise, returns false.
## ShowAllPatient():
This method shows all ids of the waiting patients in SORTED order. (Hint: use the sorting methods learnt in class using the appropriate data-structure for each task) [Sorted according to their names]
 
# T ask 1
Solve the above problem using a circular array based queue.
# Task 2
Solve the above problem using a linked list based queue.
