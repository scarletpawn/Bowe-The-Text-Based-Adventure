public class SourceCode{

	public static void main(String[] args){
    //new BlackjackWindow(2);
    //TODO
    //linked list for rooms
    //methods for common commands
    //array for inventory
    
    System.out.println("BOWE, the Text-Based Adventure");

  //ACT ONE: Purpose
    //SCENE ONE: Home Sweet Home
      //Childhood. homeschooled, follows cats, looks at dad's military thing
      //ends with the lingering implication that he wants attention?
      //Possibile Endings: death by cat
      
      System.out.println();
      System.out.println("ACT ONE, SCENE ONE: HOME SWEET HOME");
      System.out.println();

      System.out.println("You wake up in your room. Is it Monday, you wonder?");
      boolean homework = false;
      boolean tardy = false;
      int time = 10;
      boolean firstcheck = false;
      boolean up = false;
      boolean firstnap = false;
      boolean compass = false;
      boolean comb = false;
      boolean clothes = false;
      boolean hair = false;
      String action = "wake";
      boolean forgot = true;
      boolean leave = false;
      String destination = "room";
      boolean open = false;
      boolean dogtreat = false;
      boolean takehw = false;
      boolean gun=false;
      boolean catintree=false;
      boolean first = true;
      boolean dog = false;

      while(time<55 && !leave){
        System.out.println("What do you do?");
        action=IO.readString();
        System.out.println();

        if (action.equalsIgnoreCase("get up") || action.equalsIgnoreCase("rise") || action.equalsIgnoreCase("get out of bed")){
          if (up) System.out.println("You're already up");
          else{
           System.out.println("A good start to the day.");
            up = true;
            time++;
          }
        }

        else if(action.equalsIgnoreCase("think") || action.equalsIgnoreCase("remember")){
          if (!up) System.out.println("You can't exactly remember... but somthing tells you it's below you");
          else System.out.println("The thing you forgot... it's near your bed, you think.");
          time++;
        }

        else if (action.equalsIgnoreCase("look at bed") || action.equalsIgnoreCase("check bed") || action.equalsIgnoreCase("inspect bed")){
          if (forgot) System.out.println("Not the tidiest, but nice enough... hey, is something peeking under?");
          else System.out.println("Not the tidiest, but nice enough...");
          time++;
        }        

        else if (action.equalsIgnoreCase("look at window") || action.equalsIgnoreCase("look through window")){
          System.out.println("You see the wilderness in your backyard. One of the six cats you've gotten to know is lying under a tree. You feel an urge to go outside, but your bedroom door will only lead you to class.");
          time++;
        }  

        else if (action.equalsIgnoreCase("open window")){
          if (!open) {
            System.out.println("Ah, the breeze. It'd be so easy to escape now.");
            open=true;
          }
          else System.out.println("It's already open");
          time++;
        }  

        else if (action.equalsIgnoreCase("follow cat") || action.equalsIgnoreCase("go to cat")){
          System.out.println("Maybe you should be outside to do that.");     
        }

        else if (action.equalsIgnoreCase("walk") || action.equalsIgnoreCase("move")){
          if (up) System.out.println("You bump into your dressor. Maybe take a look around first, your room is small."); 
          else System.out.println("You're not out of your bed yet.");     
          time++;   
        }


        else if (action.equalsIgnoreCase("inspect") || action.equalsIgnoreCase("look") || action.equalsIgnoreCase("look around") || action.equalsIgnoreCase("look at room")){
          System.out.print("You look around your room. It's pretty neat, you like to think. On the bedside is you alarm clock, near your dressor there is a mirror. The door is closed. The Sun is shining through your window.");
          if(forgot) System.out.println(".. and there's something you're forgetting. ");
          else System.out.println();
          time++;
        }

        else if (action.equalsIgnoreCase("check under bed") || action.equalsIgnoreCase("look under bed")){
          if (!takehw && forgot) System.out.println("No monsters, just unfinished homework... due today! Ah, this is what you forgot!");
          else if(!dogtreat) System.out.println("Huh, there's a doggy treat here.");
          else if (!takehw) System.out.println("Maybe it's not good practice having your homework there.");
          else if (takehw) System.out.println("Nothing under there anymore.");
          forgot = false;
          time++;
        }

        else if (action.equalsIgnoreCase("take homework") || action.equalsIgnoreCase("get homework")){
          if (!forgot && !takehw) {
            System.out.println("Good idea, you'll need this.");
            takehw=true;
          }
          else if (takehw) System.out.println("You have this already.");
          else if (forgot) System.out.println("Right! This is what you forgot! But where is it?");
          time++;
        }

        else if (action.equalsIgnoreCase("take doggy treat") || action.equalsIgnoreCase("take dog treat") || action.equalsIgnoreCase("take treat") ||  action.equalsIgnoreCase("get doggy treat") || action.equalsIgnoreCase("get dog treat")|| action.equalsIgnoreCase("get dog treat")){
          if (dogtreat) System.out.println("You already have it with you.");
          else System.out.println("Sure, why not.");
          dogtreat = true;
          time++;          
        }

        else if (action.equalsIgnoreCase("finish homework") || action.equalsIgnoreCase("do homework") || action.equalsIgnoreCase("complete homework")){
          if (!forgot) {            
            System.out.println("Ah... Finally, done!");
            time = time + 30;
            homework = true;
          }          
          else {
            System.out.println("Right! This is what you forgot! But where is it?");
            time++;
          }
        }

        else if (action.equalsIgnoreCase("check bedside") || action.equalsIgnoreCase("inspect bedside") || action.equalsIgnoreCase("look at bedside")){
          if (compass && comb) System.out.println("On your bedside is your alarm clock");
          else if (compass) System.out.println("On your bedside is your alarm clock, and a comb.");
          else if (comb) System.out.println("On your bedside is your alarm clock and your compass.");
          else System.out.println("On your bedside is your alarm clock, a comb and your compass.");
          time++;
        }
        
        else if (action.equalsIgnoreCase("use comb") || action.equalsIgnoreCase("comb hair")){
          System.out.println("Your hair is now tidy.");
          time++;    
          hair = true;      
        }

        else if (action.equalsIgnoreCase("take comb") || action.equalsIgnoreCase("get comb")){
          if (comb) System.out.println("You already have it with you.");
          else System.out.println("Sure, why not.");
          comb = true;
          time++;          
        }

        else if (action.equalsIgnoreCase("take compass") || action.equalsIgnoreCase("get compass")){
          if (compass) System.out.println("You already have it with you.");
          else System.out.println("You always carry this around.");
          compass = true;
          time++;          
        }

        else if (action.equalsIgnoreCase("go outside")){
          System.out.println("Yeah, you want to. You just need to figure out a way, preferably without running into your mother.");        
        }

        else if (action.equalsIgnoreCase("check dressor") || action.equalsIgnoreCase("inspect dressor") || action.equalsIgnoreCase("open dressor") || action.equalsIgnoreCase("look at dressor")){
          System.out.print("Inside the dressor are your clothes. ");
          if (!clothes) System.out.println("Maybe you should change into them.");
          time++;
        }
        else if (action.equalsIgnoreCase("change into clothes") || action.equalsIgnoreCase("change clothes") || action.equalsIgnoreCase("use dressor")){
          System.out.println("You changes into your day clothes.");
          time = time + 5;
          clothes = true;
        }

        else if (action.equalsIgnoreCase("use mirror") || action.equalsIgnoreCase("look at mirror")){
          System.out.println("You look into the mirror and see a young boy staring back at you. ");
          if (!hair) System.out.print("You want to comb the young boy's hair. ");
          if (!clothes) System.out.print("Maybe you should change into more proper clothes than pajamas. ");
          time++;
        }

        else if (action.equalsIgnoreCase("check clock") || action.equalsIgnoreCase("check time") || action.equalsIgnoreCase("check alarm clock") || action.equalsIgnoreCase("look at time") || action.equalsIgnoreCase("look at clock") || action.equalsIgnoreCase("look at alarm clock")){
          if(!firstcheck){ 
            System.out.println("Oh, good, you're not late yet.");
            firstcheck=true;
          }
          System.out.println("It's 7:"+time+". Class start in "+(55-time)+" minutes.");
          time++;  
        }

        else if (action.equalsIgnoreCase("sleep") || action.equalsIgnoreCase("nap") || action.equalsIgnoreCase("go back to sleep") || action.equalsIgnoreCase("go to sleep")){
          if (firstnap) System.out.println("Nope, you're not ready for today yet.");
          System.out.println("You nestle back under your covers and close your eyes.");
          time = time + 30;
          System.out.println("You wake up from your nap, wondering if now is the time to take on the day.");
          firstnap = true;
          up = false;
        }
        
        else if(action.equalsIgnoreCase("use door") || action.equalsIgnoreCase("go to door") || action.equalsIgnoreCase("go through door") || action.equalsIgnoreCase("go to class")){
          if (forgot) {
            System.out.println("Are you sure? You're still forgetting something...");
            destination = "class";
            action = IO.readString();
            while (!(action.equalsIgnoreCase("yes"))|| !(action.equalsIgnoreCase("no"))){
              if (action.equalsIgnoreCase("yes")) {
                leave=true;
                action = destination;
                break;
              }
              else if (action.equalsIgnoreCase("no")) break;
              else System.out.println("Answer with ''yes'' or ''no''");
              action = IO.readString();
            }
          }
          else if (!homework) {
            System.out.println("Are you sure? You still didn't do your homework...");
            destination = "class";
            action = IO.readString();
            while (!(action.equalsIgnoreCase("yes"))|| !(action.equalsIgnoreCase("no"))){
              if (action.equalsIgnoreCase("yes")) {
                leave=true;
                action = destination;
                break;
              }
              else if (action.equalsIgnoreCase("no")) break;
              else System.out.println("Answer with ''yes'' or ''no''");
              action = IO.readString();
            }
          }
          else break;          
        }

        
        else if (action.equalsIgnoreCase("use window") || action.equalsIgnoreCase("go through window") || action.equalsIgnoreCase("crawl out window")){
          destination = "outside";
          leave=true;
        }

        else {
          System.out.println("Sorry, can't do that.");
        }
      }
      
      if(time>=55){
        System.out.println();
        System.out.println("The door swings open! Your mother comes in and yells at you for being late for class, for goodness sake, it's right outside your door. Did you even do your homework, she asks?");
        if(homework) System.out.println("You nod yes.");
        if(!homework) System.out.println("No, you reply meekly.");
        System.out.println("She tsks at you and drags you to class.");
      }

      else if(destination.equals("outside")){
        System.out.println();
        System.out.println("Why use doors when you can use windows? You go out the window impulsively and land softly on the bush below. You see a cat scurrying off into the woods.");
        time++;
        while(time<65){
          System.out.println("What do you do?");
          action=IO.readString();
          System.out.println();
          if (action.equalsIgnoreCase("inspect") || action.equalsIgnoreCase("look") || action.equalsIgnoreCase("look around")){
            if (!dog) System.out.print("You see mud tracks on the floor. ");
            System.out.print("In the distance, you can still see the cat, somewhere behind all the trees. ");
            if (!gun) System.out.println("Something is pointing out of the bush. ");
            else System.out.println();
            time++;
          }

          else if (action.equalsIgnoreCase("climb tree") || action.equalsIgnoreCase("go up tree")){
            if (catintree) {
              System.out.println("You feel a bit like a hero as you climb up to rescue the cat. Somehow all the stalking you do made the cat trust you, and he easily goes into your arms. Climbing down was the hard part, but you manage. Once the cat sensed you were on steady ground, he jumped off and disappeared into the woods.");
              catintree=false;
              time=time+5;
            }
            else System.out.println("You climb a tree and get a better view of the landscape. From here, you can see a couple of cats scattered around the woods, an abandoned shack a bit far off and the creek your dog likes to play in.");
            time=time+5;;
          }          

          else if (action.equalsIgnoreCase("inspect tracks") || action.equalsIgnoreCase("look at tracks") || action.equalsIgnoreCase("check tracks")){
            System.out.println("The paw prints seem a little too big to be a cat's... ");
            time++;
          }

          else if (action.equalsIgnoreCase("follow tracks") || action.equalsIgnoreCase("go to tracks") || action.equalsIgnoreCase("walk to tracks")){
            System.out.println("This is definitely not taking you to the cat, you're starting to realize...");
            time=time+5;
            System.out.println("The tracks lead you to the creek. Your dog runs up to greet you. You see another cat in the distance.");
            dog = true;
          }

          else if (action.equalsIgnoreCase("feed dog") || action.equalsIgnoreCase("use doggy treat") || action.equalsIgnoreCase("give dog treat") || action.equalsIgnoreCase("feed dog treat")){
            if (!dogtreat) System.out.println("You don't have a doggy treat.");
            else if (!dog) System.out.println("Your dog isn't with you.");
            else System.out.println("Your dog comes up to you and eats the treat. He's a boy's best friend.");
            time++;
          }

          else if (action.equalsIgnoreCase("pet dog") || action.equalsIgnoreCase("scratch dog") || action.equalsIgnoreCase("touch dog")){
            if (!dog) System.out.println("Your dog isn't with you.");
            else System.out.println("You rub your dog's belly. Dogs may not be able to talk, but at least they can still be your friend.");
            time++;
          }

          else if (action.equalsIgnoreCase("inspect bush") || action.equalsIgnoreCase("look at bush") || action.equalsIgnoreCase("check bush")){
            if (gun) System.out.println("Just a normal bush.");
            else System.out.println("Oh, here's your BB gun.");
            time++;
          }

          else if (action.equalsIgnoreCase("take BB gun") || action.equalsIgnoreCase("take gun") || action.equalsIgnoreCase("get BB gun")  || action.equalsIgnoreCase("get BB gun")){
            if (!gun) {
              System.out.println("Taken.");
              gun = true;
              time++;
            }
            else System.out.println("You already have it.");
          }


          else if (action.equalsIgnoreCase("shoot BB gun") || action.equalsIgnoreCase("shoot gun")){
            if (gun) {
              System.out.println("You raise your BB gun and fire aimlessly into the woods.");
              time++;
            }
            else System.out.println("You don't have a weapon.");
          }

          else if (action.equalsIgnoreCase("shoot cat")){
            if (gun) {
              System.out.println("You raise your BB gun and aim for the cat. You see the cat fall from your pellet. Good aim!");
              time++;
              catintree = false;
            }
            else System.out.println("You don't have a weapon.");
          }

          else if (action.equalsIgnoreCase("shoot dog")){
            if (dog && gun) {
              System.out.println("You raise your BB gun and aim for your dog. You shoot, but the dog dodges the pellet and runs off.");
              time++;
              dog = false;
            }
            else System.out.println("Can't do that.");
          }

          else if (action.equalsIgnoreCase("think")){
            if (!homework) System.out.println("It's nice you live near the woods, you think. It gives you a lot of peace and quiet.");
            else System.out.println("What is good? Why isn't everyone always good? We should always do what's best...");
            time++;
          }
          

          else if (action.equalsIgnoreCase("walk") || action.equalsIgnoreCase("wander") || action.equalsIgnoreCase("move") ){
            if (first){
              System.out.println("You walk a bit and see a cat stuck in a tree.");
              first = false;
              catintree=true;
              time=time+5;
            } 
            else System.out.println("You idly explore the woods... you see a cat in the distance.");
            time=time+5;
          }
          
          else if (action.equalsIgnoreCase("follow cat") || action.equalsIgnoreCase("go to cat")){
            System.out.println("You follow the cat through the woods. You're pretty sure the cat senses you, but you try to do it stealthily anyways, like a silent ninja.");
            time = time + 10;
            System.out.println();
            System.out.println("The cat's getting away!");
          }

          else if (action.equalsIgnoreCase("use window") || action.equalsIgnoreCase("go through window") || action.equalsIgnoreCase("go to bedroom")){
            System.out.println("You can't reach the window.");
          }

          else {
            System.out.println("Sorry, can't do that.");
          }
        }
        System.out.println();
        System.out.println("Oh, no, you see your mom approaching you. You're very late for class, she yells. Did you even do your homework, she asks?");
        if(homework) System.out.println("You nod yes.");
        if(!homework) System.out.println("No, you reply meekly.");
        System.out.println("She tsks at you and drags you to class.");
      }

      if(destination.equals("class")){
        System.out.println();
        if (!homework && !forgot) 
          System.out.println("You see your mother sitting in the kitchen table, preparing today's lesson. Well, you're not late. But maybe you should've done the homework... You never were a great student anyways, you remind yourself.");
        if (!homework && forgot) 
          System.out.println("You see your mother sitting in the kitchen table, preparing today's lesson. She won't be happy about you forgetting to do your homework. You never were a great student anyways, you remind yourself.");
        if (homework && !forgot) 
          System.out.println("You see your mother sitting in the kitchen table, preparing today's lesson. What a relief! Homework done and not even late. Days like these, you don't feel like such a bad student.");
      }

    System.out.println();
    System.out.println("END SCENE ONE");
  }
}


    //SCENE TWO: New Family
      //Teenager (13), works, finds new family
      //ends with the implication that he wants a purpose
      //Possible Endings: 
    
    //SCENE THREE: The Coast Guard
      //Possible Endings: death at coast guard

    //SCENE FOUR: Back Home
      //ends with the implication to enroll in military
      //Possible Endings: 
  
  //ACT TWO: The Perfect Soldier
    //SCENE ONE: The Perfect Soldier
      //read books, bad at socializing, pipes, etc 
      //ends with implication that he's going to desert
      //Possible Endings: death 

    //SCENE TWO: Desertion
      //and capture. deserts army, tries to "desert" (escape) the Taliban
      //puzzles to escape

    //SCENE THREE: The Trade
      //try to remember intel

    //SCENE FOUR: The Rose Garden
      //don't speak pashto!

  //ACT THREE: Recovery
    //ACT NINE: The Compass
      //rehabil. in hospital. they like you! you sleep on the bathroom floor. 

    //ACT TEN: Mark
      //damn, people are ALL over you. but there's this guy, Mark, he seems cool to talk to. he even made some great war movies.

    //ACT ELEVEN: Serial
      //unfinished?
      //what's the decision?? Next time, on Serial.