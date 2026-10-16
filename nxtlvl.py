print("                                                                          A SYSTEEM TO MAKE THE Social-Media ACCOUNT")
name=input(("Enter your name"));
age=int(input("Enter your age "));
gender=input("Enter your preferred Gender  * tell in male , female or prefer not to say*");
accName=name;
accAge=age;
accGender=gender;

if age>18:
    print("You get a TEEN account to use social media because you are under 18 and we do not allow you to watch any content without your parents acceptance. Enjoy :) ");
else:
    print("You get a normal account for Social-Media and we completely believe that you willuse it for good purpose.  Enjoy "); 
      
if gender=="Male" or "male" or "MALE" :
    print("Dear Sir, are you happy with the decsion taken by us?");
    
elif gender=="female" or "FEMALE" or "Female" :
    print("Dear Ma'am, are you happy with the decsion taken by us?");
    
elif gender=="prefer not to say " or "PREFER NOT TO SAY" :
    print("Dear friend we care for your privacy. Please tell if you have any issue with the decision taken by us?");    
else:
    print("Please tell it normally");
acc_gender=input();
print("Dear friend, because you have entered your gender second time,we do not mention you by pronoun right now. So do you have any problem right now");
    
consultance_of_the_user=input();

if (consultance_of_the_user=="no" or "NO" or "No") :
    print("Ok. Lets continue browsing the world");
else:
    print("Then please contact to our customer care number: 414322xxxx");
    
    
     
