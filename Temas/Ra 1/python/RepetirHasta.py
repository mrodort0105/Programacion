n = int (input("Introduce un numero"))
i= 1
while True:
    if i < n:
        print (i,end=',')
    elif i >= n:
        print ("Este numero es mas grande")
    else:
        break
    i += 1
    
        
