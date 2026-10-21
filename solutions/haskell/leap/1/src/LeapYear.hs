module LeapYear (isLeapYear) where

isLeapYear :: Integer -> Bool -- Typsignatur: isLeapyear ist name,::(hat typ), nimmt ein integer und gibt bool aus

isLeapYear year =  if year `mod` 4 == 0 && year `mod` 100 /= 0 
       then  True 
     else if  year `mod` 400 == 0 
       then True
         else False
       
     

