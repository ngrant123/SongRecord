# SongRecord
Code for the simulation of a PlayList

PlayList simulation

This code is a representation of a playlist of audio files similar to the ones used by audio playback programs such as iTunes
and Windows Media Player. It maintains simple information about each audio file as well as the correct ordering of the audio
files in the list. It also provides a series of operations for manipulating the playlist including adding and removing audio
files, displaying the contents of the list, and finding all songs that were performed by a particular artist.

The SongRecord class contains information about a particular audio file. It contains variables for the ttle and artist  as well 
as two member variables for the song's length in minutes and seconds.

The PlayList class stores all SongRecord objects that belong to a particular playlist. There is a maximum of 50 SongRecord object
allowed. It allows the user to add a Song, remove a Song, print all Songs and do many other operations. 

The PlayListOperations class tests the methods of the Playlist class and allows the user to manipulate a single Playlist object by 
performing operations on it. The main method runs a menu driven application which first creates an empty Playlist and then prompts 
the user for a menu command selecting the operation.
