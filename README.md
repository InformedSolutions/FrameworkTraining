# Appointments Booking System Project

Team Luke and Rachel

## Data 

An Appointment has 
*	Id 
*	Date and Time of appointment plus Duration 
*	Provider 
*	Client 
*	Cost / charge 
*	Description 
*	Flag to indicate if the client attended or not (for past appointments) 
 
A Provider has 
*	Id 
*	Name 
*	Area of expertise 
*	(A provider could be an OT, a Physio, a Dentist, a Doctor, etc.) 
 
A Client has 
*	Id and Name 
*	Address 
*	Contact phone number and email address 
## Key Features 
*	[ ] Register a provider
*	[ ] Register a client 
*	[ ] Allow a client to book an appointment / change / cancel an appointment with a provider (note that provider must be free for the specified period of the appointment) 
*	[ ] List all Appointments 
*	[ ] List all Appointments for a provider 
*	[ ] List all appointments for a client 
## Extension points 
*	[ ] Notify a provider of any change in their schedule 
*	[ ] List all Appointments for a provider this may be current, all for today, in the past or between two specified dates 
*	[ ] List all appointments for a client this may be current, all for today, in the past or between two specified dates 
*	[ ] Show stats on the number of appointments 
    * Cancelled 
    * Missed 
    * Per provider 
 
The system should provide a web front end, with a service-based server tier and a MySQL database backend. 
