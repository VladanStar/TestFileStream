# TestFileStream
  a listing that uses I / O binary operations to write ten bytes with values from 1 to 10 to the temp.dat file and read them back from the file. After execution, the program displays the following result on the monitor: 1 2 3 4 5 6 7 8 9 10. The FileOutputStream object was created for the temp.dat file in line 6. The for loop writes ten values to the file (lines 9-10). Invoking write (i) has the same effect as invoking write (byte) u). Line 13 closes the output stream. Line 16 creates a FileInputStream object for the temp.dat file. Values are loaded from the file and displayed on the console in lines 19-21- The expression (value = input.read ())! = -1) (line 20) reads a byte from input.read ()., Assigns it values and checks it is it -1. Input value -1 indicates the end of the file.
