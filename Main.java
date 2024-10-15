import java.util.Scanner;
/*roll a dice and have certain things happen depending on a random number. Can happen randomly or when an event is triggered*/
class Main 
{
  //party function
  public static void party()
  {
    Scanner scan = new Scanner(System.in);
    String choice = "";
    int roll;
    System.out.println("You decide you deserve to have a party at the end of your long day. You walk up to the drink counter and take a drink. Roll the die for the type of drink. Type 'roll'");
    choice = scan.nextLine();
    if (choice.toLowerCase().equals("roll"))
    {
      roll = (int)(Math.random()*(50)+0);
      if (roll >= 25) //good drink
      {
        System.out.println(roll + " Congratulations!");
        System.out.println("You pick up a tropical island drink and turn towards the dance floor. Before long, you are dancing and drinking and partying, having the time of your life! After the party, you board the boat back to your homeland, knowing you'll remember this trip for the rest of your life.");//end of a story
      }
      else //bad drink
      {
        System.out.println(roll + " Unlucky!");
        System.out.println("You grab a drink off the counter. It tastes a little funny, but you attribute that to the food here that you've never had before. However, as the night progresses, you start to feel funny. Roll the die to see what will happen. Type 'roll'");
        choice = scan.nextLine();
        if (choice.toLowerCase().equals("roll"))
        {
          roll = (int)(Math.random()*(50)+0);
          if (roll >= 25)//pass out and stranded
          {
            System.out.println(roll + " Congratulations!");
            System.out.println("You start to feel woozy so you sit down. You end up passing out and waking up after your boat has left the island. You are now stranded in this island country with nothing.");//end of a story
          }
          else //die from drink
          {
            System.out.println(roll + " Unlucky!");
            System.out.println("You feel worse and worse so you sit down. You start throwing up so violently that blood is coming out. You pass out from weakness and die.");//end of a story
          }
        }
        else //they didn't roll, but fate is kind
        {
          System.out.println("(You are chancing fate)");
          System.out.println("The funny feeling fades after a few minutes and you carry on with the party. After a full night of dancing and drinking and partying, you board the boat back to your homeland, happy with how your trip went.");//end of a story
        }
      }
    }
    else //put drink back and still party
    {
      System.out.println("On second thought, you don't want a drink. You put the drink back, but still stay for the party. You dance and have fun all night and board the boat to your homeland after."); //end of a story
    }
  } //end of party function

  //coastal path part two
  public static void contCoastalPath()
  {
    //when they choose to continue along the coastal path. This is the second half of the coastal story so it will be a long function
    Scanner scan = new Scanner(System.in);
    int roll;
    System.out.println("Back on the path now, you continue walking along the scenic coast. Farther up the path, you spot what looks like a seagull picking at something just off the path. Do you go around the seagull, or get closer to see what it's picking at? (around/closer)");
    String choice = scan.nextLine();
    if (choice.toLowerCase().equals("around")) //around the bird and cont. on
    {
      System.out.println("You decide you don't want to mess with whatever is entertaining the seagull, so you take a wider path around it and continue on. You walk along the coast, staring out at the water and hozizon when something catches your eye. You turn to see a large, crystal-looking rock. The sun is starting to set and sends a dazzling display through the crystal. While the vivid oranges, bright pinks, stunning yellows, and deep reds blend together in what must be the most beautiful sunset in the world, they bleed through the crystal into a myriad of other colors, magnifying the stunning display! You stare, transfixed.");
      System.out.println(". . .");
      System.out.println("As the memorizing sunset fades into the most beautiful night, you begin to move along the path again. Under the brilliant stars and peaceful gentle breeze, you see the lights of the village dancing a little father ahead. You enjoy the last few minutes of your peaceful walk and walk into the village that's swept up in a lively party. Do you want to stay for the party, or enjoy more quiet on the boat that will take you home? (party/boat)");
      choice = scan.nextLine();
      if (choice.toLowerCase().equals("party")) //stay for the party
      {
        party();//endings
      }
      else //go back to the boat
      {
        System.out.println("You decide the noise of the party is too startling after your quiet walk, so you make your way towards the boat that will take you to your homeland. As you're leaving the island, you start making plans to come back. This island had some of the most beautiful sights you've ever scene!"); //end of a story
      }
    }
    else //closer to the seagull
    { 
      System.out.println("Your curiosity gets the better of you, so you move closer to the seagull to see what it's picking at. It looks like a crab that's holding a pretty rock. Do you want to help the seagull get the crab or rock, or do you want to help the crab ward away the seagull? (seagull/crab)");
      choice = scan.nextLine();
      if (choice.toLowerCase().equals("seagull")) //help the seagull
      {
        System.out.println("You decide you want to help the seagull out so you throw a rock at the crab and stun it. The seagull takes the opportunity to grab the rock the crab was holding and fly off with it. Strange, you think, that the seagull wasn't trying to eat the crab, but oh well. You carry on with your walk along the coast. After a while of walking and staring out at the water and horizon, something catches your eye. You turn to see a large, crystal-looking rock that looks like a bigger version of the rock that that seagull wanted so badly. The sun is starting to set and sends a dazzling display through the crystal. While the vivid oranges, bright pinks, stunning yellows, and deep reds blend together in what must be the most beautiful sunset in the world, they bleed through the crystal into a myriad of other colors, magnifying the stunning display! You stare, transfixed.");
        System.out.println(". . .");
        System.out.println("As the memorizing sunset fades into the most beautiful night, you begin to move along the path again. Under the brilliant stars and peaceful gentle breeze, you see the lights of the village dancing a little father ahead. You enjoy the last few minutes of your peaceful walk and walk into the village that's swept up in a lively party. Do you want to stay for the party, or enjoy more quiet on the boat that will take you home? (party/boat)");
        choice = scan.nextLine();
        if (choice.toLowerCase().equals("party")) //stay for the party
        {
          party();//endings
        }
        else //go back to the boat
        {
          System.out.println("You decide the noise of the party is too startling after your quiet walk, so you make your way towards the boat that will take you to your homeland. As you're leaving the island, you start making plans to come back. This island had some of the most beautiful sights you've ever scene!"); //end of a story
        }
      }
      else //help the crab
      {
        System.out.println("You want to help the crab so that it's not eaten by the seagull, so you run at the seagull to scare it off. It takes a little bit and you swinging your bag at the seagull for it to leave, but it finally takes off to go find easier to aquire food. You examine the crab and the rock it's holding now. The rock is gorgeous. Do you want to try to take the rock, or just leave the crab along and continue on your way? (rock/leave)");
        choice = scan.nextLine();
        if (choice.toLowerCase().equals("rock"))//try to take the rock
        {
          System.out.println("You now see why the seagull was bothering the crab so much, the rock is almost pulling you towards it. You reach for it. Roll the die to see what happens. Type 'roll'");
          choice = scan.nextLine();
          if (choice.toLowerCase().equals("roll"))
          {
            roll = (int)(Math.random()*(50)+0);
            if (roll >= 25)//the crab lets you have the rock
            {
              System.out.println(roll + " Congratulations!");
              System.out.println("You grab the rock, but the crab snaps you hand. You start trying to shake it off. It hurts! You finally throw the crab back, rock still in its claw. You try one more time and this time you're successful. You now have the rock after the brief (but still way too long for a rock) struggle with the crab. You start to wonder why you even bothered as you begin walking again, but then the sun starts setting. Vivid oranges, bright pinks, stunning yellows, and deep reds blend together in a dazzling display that gets even more amazing when you hold the rock up to it. Every color you can imagine shines through. It's the most beautiful thing you have ever seen! You are stunned and glad you were able to get the rock from that crab. The sunset starts fading into a beautifully calm night, dotted with many bright stars, and you start walking again.");
              System.out.println(". . .");
              System.out.println("After a peaceful walk under the night sky, you come upon the village in the midst of a lively party. Do you want to stay for the party, or enjoy more peace and quiet on the boat that will take you back to your homeland? (party/boat)");
              choice = scan.nextLine();
              if (choice.toLowerCase().equals("party"))//stay for the party
              {
                party();//endings
              }
              else //go to the boat
              {
                System.out.println("You decide you want to enjoy some more quiet, so you head back to the boat.");
                System.out.println(". . .");
                System.out.println("As the boat is leaving, you feel the beautiful rock in your pocket and wistfully remember the stunning sunset that you will never forget.");//end of a story
              }
            }
            else //you struggle for the rock but don't get it
            {
              System.out.println(roll + " Unlucky!");
              System.out.println("On your first attempt, the crab snips at your hand. You try several more times, and each time, the crab snaps at you. You finally decide to just grab the crab and it latches onto your hand. You start trying to shake it off. It hurts! You finally throw the crab back, rock still in its claw. You give up and continue along the path. You stare out at the horizon as the sun starts to set. Vivid oranges, bright pinks, stunning yellows, and deep reds light up the sky in a dazzling display. You stand, transfixed, watching as the sky begins to fade into the soft blanket of night, dotted with bright stars. After this stunning display, you continue your walk and reach the village. It's alight with a lively party. Do you want to stay for the party, or go back to the boat that will take you home early? (party/boat)");
              choice = scan.nextLine(); 
              if (choice.toLowerCase().equals("party"))//stay for the party
              {
                party();//endings
              }
              else //back to boat
              {
                System.out.println("You decide you'd rather go to the boat than participate in the loud party. As you board the boat, you think you might like to come back someday and explore the inland jungle.");//end of a story 
              }
            }
          }
          else //don't roll and decide to not take the rock
          {
            System.out.println("On second thought, the crab looks a little too attached to that rock. Despite the obvious pull of it, you take your hand back and decide to continue on the path. You walk along the coast, staring out at the water and hozizon when something catches your eye. You turn to see a large, crystal-looking rock. This might've been where the crab got the rock. The sun is starting to set and sends a dazzling display through the crystal. While the vivid oranges, bright pinks, stunning yellows, and deep reds blend together in what must be the most beautiful sunset in the world, they bleed through the crystal into a myriad of other colors, magnifying the stunning display! You stare, transfixed.");
            System.out.println(". . .");
            System.out.println("As the memorizing sunset fades into the most beautiful night, you begin to move along the path again. Under the brilliant stars and peaceful gentle breeze, you see the lights of the village dancing a little father ahead. You enjoy the last few minutes of your peaceful walk and walk into the village that's swept up in a lively party. Do you want to stay for the party, or enjoy more quiet on the boat that will take you home? (party/boat)");
            choice = scan.nextLine();
            if (choice.toLowerCase().equals("party")) //stay for the party
            {
              party();//endings
            }
            else //go back to the boat
            {
              System.out.println("You decide the noise of the party is too startling after your quiet walk, so you make your way towards the boat that will take you to your homeland. As you're leaving the island, you start making plans to come back. This island had some of the most beautiful sights you've ever scene!"); //end of a story
            }
          }
        }
        else //leave the crab alone
        {
          System.out.println("You decide the crab has had a hard enough day, so you leave it alone and continue on your way. You walk along the coast, staring out at the water and horizon when something catches your eye. You turn to see a large, crystal-looking rock. The sun is starting to set and sends a dazzling display through the crystal. While the vivid oranges, bright pinks, stunning yellows, and deep reds blend together in what must be the most beautiful sunset in the world, they bleed through the crystal into a myriad of other colors, magnifying the stunning display! You stare, transfixed.");
          System.out.println(". . .");
          System.out.println("As the memorizing sunset fades into the most beautiful night, you begin to move along the path again. Under the brilliant stars and peaceful gentle breeze, you see the lights of the village dancing a little father ahead. You enjoy the last few minutes of your peaceful walk and walk into the village that's swept up in a lively party. Do you want to stay for the party, or enjoy more quiet on the boat that will take you home? (party/boat)");
          choice = scan.nextLine();
          if (choice.toLowerCase().equals("party")) //stay for the party
          {
            party();//endings
          }
          else //go back to the boat
          {
            System.out.println("You decide the noise of the party is too startling after your quiet walk, so you make your way towards the boat that will take you to your homeland. As you're leaving the island, you start making plans to come back. This island had some of the most beautiful sights you've ever scene!"); //end of a story
          }
        }
      }
    }
  } //end of coastal path part two

  //beach part two
  public static void beach2()
  {
    int roll;
    Scanner scan = new Scanner(System.in);
    System.out.println("The sun is setting in a brilliant mix of colors like you have never seen before. It's memorizing. The vivid oranges, bright pinks, stunning yellows, and deep reds blend together in what must be the most beautiful sunset in the world! You sit, transfixed by the stunning display. As the event starts to come to a close and the sky starts to darken with the soft blanket of the night, you remember there was to be a party tonight in the village further down the coast. You saw the sign back up on the overlook. Do you want to go to the party, or sit here a while longer, enjoying the peaceful night and still soaking in the miraculus sunset? (party/stay)");
    String choice = scan.nextLine();
    if (choice.toLowerCase().equals("party")) //go back to path and go to party
    {
      System.out.println("You decide you don't want to miss the party, so you clamber back up the path to the cliffside path, and continue following it to the village.");
      System.out.println(". . .");
      System.out.println("You walk into the village and find the party in full swing. It's a little overwhelming after your quiet night walk along the coast. Do you still want to party, or go back to the boat now? (party/boat)");
      choice = scan.nextLine();
      if (choice.toLowerCase().equals("party")) //stay for party
      {
        party(); //endings
      }
      else //back to boat
      {
        System.out.println("You decide your day was eventful enough and want to head back to the boat now.");
        System.out.println(". . .");
        System.out.println("As you board the boat that will take you back to your homeland, you look back wistfully at the island, hoping you will be able to come back again, if only for the beautiful sunsets."); //end of a story
      }
    }
    else //stay and meet creature
    {
      System.out.println("You decide you'd rather stay on this beautiful beach than go to the party.");
      System.out.println(". . .");
      System.out.println("After a long, peaceful time of listening to the waves under the enchanting light of the stars, you spot a shadow out on the rocks. While you are trying to discern what it is, it moves, startling you. It appears to be looking straight at you. Do you run away now, or wait for it? (run/wait)");
      choice = scan.nextLine();
      if (choice.toLowerCase().equals("run"))//run from creature
      {
        System.out.println("The mysterious shadow terrifies you, especially since it looks like it's moving towards you. You turn back and dash up the path to the overlook. Running along the coastal path, you don't stop until you can't breathe. By this point, you are at the edge of the village. You turn around to see if the shadow followed you. It doesn't appear to have followed you all the way here and for that, you're incredibly grateful. You walk into the village in the midst of the party, a little shaken up. Do you want to participate in the party, or just head back to the boat to go home? (party/boat)");
        choice = scan.nextLine();
        if (choice.toLowerCase().equals("party")) //stay for the party
        {
          party(); //endings
        }
        else //head back to the boat to go home
        {
          System.out.println("You're still too shaken up to party, so you decide to head back to the boat that will take you to your homeland.");
          System.out.println(". . .");
          System.out.println("As you get on the boat, you think that you will never be able to come back. Regretfully, you'll never be able to see that sunset again. You wish that you never stayed on that beach long enough to see that shadow creature."); //end of a story
        }
      }
      else //wait to see the creature
      {
        System.out.println("Even though the shadow creature seems to be coming towards you, something makes you stay and wait for it.");
        System.out.println(". . .");
        System.out.println("When it is finally close enough to make out, you draw in a sharp breath. The creature is beautiful, glowing with a translucent shine. The stunning blues and greens of water swirl around this creature, making up its body. Fins decorate its arms and its lower body tapers off into a magnificant tail. Its hair flows long and elegant around its body. Its ears poke out, reminiscent of fins themselves. Their eyes are a startling black. The creature calls to you in an enchanting voice, neither a mans, nor a womans. Do you go to it, or run?(go/run)");
        choice = scan.nextLine();
        if (choice.toLowerCase().equals("go")) //go to the creature
        {
          System.out.println("You are enchanted a start moving towards the creature. When you stop in front of it, they reach towards you, offering a hand. You reach forwards and take their hand, unable to stop yourself. Roll the die to see what happens. Type 'roll'");
          choice = scan.nextLine();
          if (choice.toLowerCase().equals("roll"))
          {
            roll = (int)(Math.random()*(50)+0);
            if (roll >= 25) //they take you under to live with them
            {
              System.out.println(roll + " Congratulations!");
              System.out.println("The creature starts leading you into the water and you vaguely remember that you can't breathe underwater. Even so, you follow them down, holding your breath.");
              System.out.print(". . .");
              System.out.println("You start to wonder where you are going as you start to feel the urge to take a breath. You can't see anything and begin to panic, thinking you might have made a mistake. The creature soothes you, saying we are almost there. Just as you believe you can't hold your breath any longer, you spy a beautiful underwater city, glowing with the same blues and greens as the creature currently pulling towards it. As soon as the two of you pass the border of the city, the creature - Arya they say - tells you you can breathe now. You take a glorious breath of air and smile, amazed at what you see. Arya smiles at you and asks if you want to go further and see the city. You enthusiastically say yes. They start to give you a tour of the city.");
              System.out.println(". . .");
              System.out.println("A few days later, you are sitting with Arya and surmise that you are the happiest you've ever been in your life. You want to stay here forever. You turn to Arya and tell them this. You think to yourself, you are so happy you followed them that day on the beach.");//end of a story
            }
            else //they take you under and kill you
            {
              System.out.println(roll + " Unlucky!");
              System.out.println("The creature starts leading you into the water and you are completely mesmerized so you don't immediately remember that you can't breathe underwater. Even still, you hold your breath and trust and follow them.");
              System.out.println(". . .");
              System.out.println("They keep pulling you deeper and you start to wonder what will happen. You want to ask, but you can't talk underwater. Suddenly, they stop and look at you. The smile that forms on their face is malicious and you start to panic. The creature holds you down and watches you drown, smiling all the while. The last thought you have is that you should've never followed them.");//end of a story
            }
          }
          else //don't roll something scares the creature
          {
            System.out.println("As you start to be lead into the water, the creature suddenly pulls back, frightened by something. They dive back under the water. Try as you might, you can't see where they went. Disappointed and sorrowed beyond belief, you head back up to the coastal path. Walking along the path, you finally get to the village. The whole village is wrapped up in the celebrations of the party you forgot was happening tonight. Do you want to party to try to forget the creature, or do you want to head back to the boat that will take home and mope. (party/boat)");
            choice = scan.nextLine();
            if (choice.toLowerCase().equals("party")) //stay and party
            {
              party();//endings
            }
            else //boat and go home
            {
              System.out.println("You are too depressed to party, so you decide to head back to the boat. As you board the boat to your homeland, you know you will never come back because you will always be reminded of that beautiful creature you couldn't follow.");//end of a story
            }
          }
        }
        else //run from the creature
        {
          System.out.println("The creature is as intimidating as it is enchanting, but you somehow find the will to run. Scambling up the path and running along the coastal path, you don't stop until you can't breathe. Looking back, there's no sign of the creature, so you enter the village that's in full swing for the party. You're curious of what the creature was, but you are afraid to ask someone in case they think you're crazy. Do you ask, or try to forget? (ask/forget)");
          choice = scan.nextLine();
          if (choice.toLowerCase().equals("ask")) //ask a villager
          {
            System.out.println("You need to sate your curiosity so you find a sober-looking native and ask them. When you describe the water creature, the villager looks shocked. The creature you descibed is a local legend and those creatures have been blamed for a number of disappearances. You become nervous and don't know if the reaction of the villager is a good thing. Roll to find out what this reaction means. Type 'roll'");
            choice = scan.nextLine();
            if (choice.toLowerCase().equals("roll")) 
            {
              roll = (int)(Math.random()*(50)+0);
              if (roll >= 25) //good roll: love you and center of party
              {
                System.out.println(roll + " Congratulations!");
                System.out.println("After a moment, the villager's face spreads into a smile and he turns around to grab someone else and tell them you saw a legend! The rest of the night, you are congratulated and asked questions about what you saw. You drink and have fun all night, until you eventually have to get back to the boat to go home. Leaving, you know you had the best time on this island, despite the fear of and longing for that water creature."); //end of a story
              }
              else //bad roll: wary and tell you to leave
              {
                System.out.println(roll + " Unlucky!");
                System.out.println("The villager and other villagers become wary of you and suggest you leave. A little scared and offended, you make your way back to the boat that will take you home. You board the boat and leave this island behind forever, too disconcerted and scared to come back."); //end of a story
              }
            }
            else //don't roll and just leave the village
            {
              System.out.println("You decide you don't want to stick around to find out what the reaction means. You head back to the boat that will take you back to your homeland, wary of ever coming back to this beautiful island country."); //end of a story
            }
          }
          else //try to forget the creature
          {
            System.out.println("Too scared to see someones reaction, you decide not to ask what the creature was. Now you have to decide if you want to stay for the party, or go back to the boat that will take you home. (party/boat)");
            choice = scan.nextLine();
            if (choice.toLowerCase().equals("party")) //stay and party
            {
              party(); //endings
            }
            else //back to boat
            {
              System.out.println("You decide you are too worn out to party, so you head back to the boat that will take you to your homeland. After you have boarded, you reflect that this burning curiosity and meeting with the creature with haunt your thoughts for the rest of your life."); //end of a story
            }
          }
        }
      }

    }
  } //end of beach part two

  //beach part one
  public static void beach()
  {
    Scanner scan = new Scanner(System.in);
    int roll;
    System.out.println("Down at the beach, you slip off your shoes and feel the soft sand beneath your feet. There's a large boulder sitting on the beach. Do you want to stay for a while and sit on the boulder, or do you want to walk the beach for a few more minutes and the head back to the path? (stay/leave)");
    String choice = scan.nextLine();
    if (choice.toLowerCase().equals("stay")) //stay on beach
    {
      System.out.println("That boulder is looking very inviting and you decide to stay for a while. Do you want to just wait and watch the waves, read, or take a nap? (watch/read/nap)");
      choice = scan.nextLine();
      if (choice.toLowerCase().equals("watch")) //watch the waves
      {
        System.out.println("The waves are very alluring and you decide to stop and watch.");
        System.out.println(". . .");
        System.out.println("After a while of watching the waves crash against the rocks and lap gently against the beach, watching the birds fly over, and watching the sky change, something you've been waiting for finally happens.");
        beach2(); //endings
      }
      else if (choice.toLowerCase().equals("read")) //read on the boulder
      {
        System.out.println("You decide to read to pass the time while you listen to the peaceful sounds of the waves.");
        System.out.println(". . .");
        System.out.println("The book is entertaining, but something urges you to look up. And you are glad you did because you look up to see the most amazing thing you might've missed otherwise!");
        beach2(); //endings
      }
      else //take a nap
      {
        System.out.println("Already exhausted by your walk here and your effort to get down to the beach, you decide to take a short nap.");
        System.out.println(". . .");
        System.out.println("You wake up all too soon - you're still tired. But as soon as you open your eyes, you are incredibly grateful for waking up at this time.");
        beach2(); //endings
      }
    }
    else //leave and head back to the coastal path soon
    {
      System.out.println("You decide you want to see a lot more of the island before it gets dark, so you'll leave soon.");
      System.out.println(". . .");
      System.out.println("After walking around the beach and enjoying the feel of the sand, you start to head back to the coastal path that you were walking on.");
      contCoastalPath();
    }
  } // end of beach part one

  //continuation of coatal path with tour guide
  public static void coastalPath2Tour()
  {
    String choice = "";
    int roll;
    Scanner scan = new Scanner(System.in);
    System.out.println("Walking along the coastal path, you are enjoying the gental sounds of the waves and Garia's voice fades into the background. Suddenly, they cut in, asking you if you are alright. You say you are, just lost in the sounds of the waves. They understand and decide to do the next part of the tour in silence.");
    System.out.println(". . .");
    System.out.println("After a few minutes of beautiful, peaceful silence, Garia cuts in again. This time they ask if you want to move on to a different path. You look around and see no other path. Garia shows you the entrance and says that it's a little hard to fine, but it is well maintained and just as beautiful. Do you want to go onto the second path, or stay on the one you've been walking on? (new/stay)");
    choice = scan.nextLine();
    if (choice.toLowerCase().equals("new")) //new path you can't find while with no tour guide
    {
      System.out.println("You decide you want to check out the new path, so you follow Garia onto it. This path is a little futher inland, but you can still see and hear the water crashing against the island's edge. This path is less rocky and has more plant life. it looks like it rained recently because you can see water clinging to the plants here. Staring at them, you can see the tiny rainbows littering them. 'It's beautiful,' you exclaim. 'Itsn't it?' Garia responds. You continue along this path, listening to the wildlife sounds on top of the waves and watching the glittering plants.");
      System.out.println(". . .");
      System.out.println("Throughout this path, Garia has been pointing out certain plants and animals and telling you interesting facts about them. Suddenly, though, they stop, urging you to look out to sea from the rhododendron you were examining. Slowly, you raise your head to see the most memorizing sight you've ever laid eyes on! The sun is setting in a brilliant mix of colors like you have never seen before. The vivid oranges, bright pinks, stunning yellows, and deep reds blend together in what must be the most beautiful sunset in the world! You stand, in awe and transfixed by the stunning display. As the event starts to come to a close and the sky starts to darken with the soft blanket of the night, Garia says you guys should get going. The wildlife gets more dangerous at night and there's to be a party in the village at the end of this path tonight.");
      System.out.println(". . .");
      System.out.println("You and Garia reach the village in the midst of a lively party. They ask if you want to stay for the party, or go back to the boat that will take you to your homeland? (party/boat)");
      choice = scan.nextLine();
      if (choice.toLowerCase().equals("party"))//stay for the party
      {
        party();
      }
      else //go to the boat
      {
        System.out.println("You tell Garia that you would rather go back to the boat now; you're not much for parties. They say okay and ask if you want someone to help you get to the boat. Do you want help? (help/alone)");
        choice = scan.nextLine();
        if (choice.toLowerCase().equals("help"))//someone leads you back to the boat
        {
          System.out.println("You graciously accept Garia's offer and they find someone to lead you back to the boat. As the boat departs this island country, you think you might like to come back and take the inland tour, or explore the coast again without a tour.");//end of a story
        }
        else //go to boat on own
        {
          System.out.println("You decline the offer for someone to lead you back to the boat, wanting some alone time for the first time since this morning. You start on the path back to the boat, nicely illuminated by the shining stars and the moon. When you are about halfway to the boat, you hear a rustling in the bushes that line the path. Roll to see what happens. Type 'roll'");
          choice = scan.nextLine();
          if (choice.toLowerCase().equals("roll"))
          {
            roll = (int)(Math.random()*(50)+0);
            if (roll >= 25) //good roll; don't get attacked
            {
              System.out.println(roll + " Congratulations!");
              System.out.println("The rustling continues for a few more a seconds and you are starting to get scared. Suddenly, a small, fluffy creature jumps out of the bush. It's about the size of a football. It's cute, but you are still a little wary. Do you want to try to pet it? (pet/leave)");
              choice = scan.nextLine();
              if (choice.toLowerCase().equals("pet"))//pet the creature and die
              {
                System.out.println("The creature looks so harmless that you move to pet it. It jumps at you and bites you. You flinch and pull away. Almost immediately, you start to feel lightheaded and lose your vision. You limbs become weak and you fall over. Your brain is foggy and the only thing you can think when you see the small creature standing over you, is that you should've run.");//end of a story
              }
              else //continue on to the boat and leave
              {
                System.out.println("You decide to leave the fluffy creature alone and continue on your way to the boat. You make it to the boat and board, thinking of your eventful day.");//end of a story
              }
            }
            else //bad roll; get attacked
            {
              System.out.println(roll + " Unlucky!");
              System.out.println("You stop and a small, fluffy creature the size of a football launches itself out of the bushes and bites you. You start feeling the effects immediately. You get lightheaded and start losing your vision. Your limbs become weak and you fall to the ground. As your mind starts to go, you look up at the creature and remember all too late Garia saying the animals get more dangerous at night.");//end of a story
            }
          }
          else //don't roll and run
          {
            System.out.println("When you hear the rustling, you mind goes to the worst possible thing, and you run instead of sticking around to find out what it was. You make it back to the boat, panting and a little dishevelled. You get some odd looks but don't care, you're safe. You board the boat and it eventually leaves to take you home.");//end of a story
          }
        }
      }
    }
    else //stay on original path
    {
      System.out.println("You are a little hesitant to go on the new path and request to stay on this one. Garia complies and continues to lead you along the rocky coastal path. Do you want to listen to Garia while they tell you about the island, or tune them out? (listen/don't)");
      choice = scan.nextLine();
      if (choice.toLowerCase().equals("listen"))//listen to Garia
      {
        //if you do listen: remmebering Garia's words, you accept a guide back to the boat
        System.out.println(". . .");
        System.out.println("After a long time of listening to Garia telling you all about the island and its creatures, they suddenly stop and direct your attention towards the sky. You look over to see the most beautiful sunset ever! Vivid oranges, bright pinks, stunning yellows, and deep reds blend together in this magnificant display. You watch, transfixed. After the sky has faded and the soft blanket of night, shining brightly with stars, sets over the island, Garia directs you to continue following them. You walk into a village alight with a party. Do you want to stay for the party or go straight back to the boat that will take you to your homeland? (party/boat)");
        choice = scan.nextLine();
        if (choice.toLowerCase().equals("party"))//stay for party
        {
          party();//endings
        }
        else //back to boat
        {
          System.out.println("You decide you want some more time to soak in the quiet night and opt to go back to the boat. Garia asks if you want someone to walk you there. Remembering what they said about the island and its creatures earlier, you accept this offer.");
          System.out.println(". . .");
          System.out.println("You were walked all the way to the boat, only encountering a soft rustling in one of the bushes which your guide quickly urged you past. You board and go home, knowing you will remember this trip fondly.");//end of a story
        }        
      }
      else //tune Garia out
      {
        System.out.println(". . .");
        System.out.println("Intent on enjoying yourself and the views of the island, you tune Garia out. Suddenly, the steady droning of Garia talking about the island that provided wonderful background noise for you stops. You stop and see what is going on. They point you towards the sky where you see the most mangificant sight ever! Vivid oranges, bright pinks, stunning yellows, and deep reds blend together in the most beautiful sunset you have ever witnessed! As the soft blanket of night covers the sky and the stars start shining, Garia urges you further along the path. The path ends at a village where a lively party is taking place. Garia asks if you want to stay for the party, or head back to the boat that will take you to your homeland immediately. (party/boat)");
        choice = scan.nextLine();
        if (choice.toLowerCase().equals("party"))//stay for the party
        {
          party();
        }
        else //go back to the boat
        {
          System.out.println("You decide you want to enjoy the night - quietly - for a little bit longer. Garia asks if you want a guide back to the boat. (yes/no)");
          choice = scan.nextLine();
          if (choice.toLowerCase().equals("yes"))//guided back to boat
          {
            System.out.println("You accept the offer of a guide back to the boat, thinking it best at night.");
            System.out.println(". . .");
            System.out.println("You and your guide made it back to the boat with no incidents. Only a small scare when the guide hurried you past a rustling bush. You board the boat and wait for it to take you back home.");//end of a story
          }
          else //don't take a guide back to the boat
          {
            System.out.println("You tell Garia that you don't want a guide back to the boat. You haven't been alone all day and just want some solitary time before you head back home. They agree and point you to the path and then go to join the party.");
            System.out.println(". . .");
            System.out.println("You start on the path back to the boat, nicely illuminated by the shining stars and the moon. When you are about halfway to the boat, you hear a rustling in the bushes that line the path. Roll to see what happens. Type 'roll'");
            choice = scan.nextLine();
            if (choice.toLowerCase().equals("roll"))
            {
              roll = (int)(Math.random()*(50)+0);
              if (roll >= 25) //good roll; don't get attacked
              {
                System.out.println(roll + " Congratulations!");
                System.out.println("The rustling continues for a few more a seconds and you are starting to get scared. Suddenly, a small, fluffy creature jumps out of the bush. It's about the size of a football. It's cute, but you are still a little wary. Do you want to try to pet it? (pet/leave)");
                choice = scan.nextLine();
                if (choice.toLowerCase().equals("pet"))//pet the creature and die
                {
                  System.out.println("The creature looks so harmless that you move to pet it. It jumps at you and bites you. You flinch and pull away. Almost immediately, you start to feel lightheaded and lose your vision. You limbs become weak and you fall over. Your brain is foggy and the only thing you can think when you see the small creature standing over you, is that you should've run.");//end of a story
                }
                else //continue on to the boat and leave
                {
                  System.out.println("You decide to leave the fluffy creature alone and continue on your way to the boat. You make it to the boat and board, thinking of your eventful day.");//end of a story
                }
              }
              else //bad roll; get attacked
              {
                System.out.println(roll + " Unlucky!");
                System.out.println("You stop and a small, fluffy creature the size of a football launches itself out of the bushes and bites you. You start feeling the effects immediately. You get lightheaded and start losing your vision. Your limbs become weak and you fall to the ground. As your mind starts to go, you look up at the creature and wish you had listened to Garia when they were talking about the island and its creatures.");//end of a story
              }
            }
            else //don't roll and run
            {
              System.out.println("When you hear the rustling, you mind goes to the worst possible thing, and you run instead of sticking around to find out what it was. You make it back to the boat, panting and a little dishevelled. You get some odd looks but don't care, you're safe. You board the boat and it eventually leaves to take you home.");//end of a story
            }
          }
        }
      }
      
    }
  }//end of coastal w/ tour part two

  public static void wade() //wade into waterfall pool
  {
    String choice = "";
    int roll;
    Scanner scan = new Scanner(System.in);
    System.out.println("You decide you want to wade into that beautifully still pool. When you and Cassive are both knee-deep, you feel a movement off to the side of you. Roll to see what happens. Type 'roll'");
    choice = scan.nextLine();
    if (choice.toLowerCase().equals("roll"))//roll for monster
    {  
      roll = (int)(Math.random()*(50)+0);
      if (roll >= 25) //good: nice monster
      {
        System.out.println(roll + " congratulations!");
        System.out.println("The water moved again in a different place. You start getting nervous. You ask Cassive if they've felt anything. They tell you some movement but that it's probably the water moving from the waterfall hitting it. A few seconds later, the water off to your right erupts and what could only be described as a sea monster. What appears to be its face whips towards you and Cassive. You both are frozen with astonishment and fear. When the sea monster is close, within two arm lengths, it opens its mouth and........smiles? Yup, it definitely looks like a smile. You and Cassive exchange glances and then look back at the monster. It nods at you encouragingly, like a dog. Do you want to reach out to pet it like a dog? (yes/no)");
        choice = scan.nextLine();
        if (choice.toLowerCase().equals("yes"))//pet monster
        {
          System.out.println("You hesitantly reach out towards the monster. It eagarly sticks its wet, smooth but scaly head under your hand. You are encouraged to start petting it. It seems happy and Cassive reaches out to pet it too. You both soon realize that this sea monster is just like a dog. You start playing with it.");
          System.out.println(". . .");
          System.out.println("After a while of playing with the sea monster, you decide its getting late and head off to go. Cassive follows. The sea monster looks sad, but waves its head goodbye. Cassive takes you back to the main path after you wring out your clothes.");
          System.out.println(". . .");
          System.out.println("During the walk on the main path, Cassive pointed out a few more species of flora and fauna unique to this island. When you emerge from the jungle, you see that a party is in full swing in the village center. Cassive asks you if you want to join or if you want them to take you back to the boat that will take you home now. (party/boat)");
          choice = scan.nextLine();
          if (choice.toLowerCase().equals("party"))
          {
            party(); //endings
          }
          else //back to boat
          {
            System.out.println("You decide you're exhausted and want to head back to the boat now. Cassive walks you back and you say thank you and goodbye. While on the ride to your homeland, you think about the fun day you had and consider planning another trip to the island.");//ending
          }
        }
        else //no: there's no way in hell you're going to put your hand near its mouth. Cassive does instead
        {
          System.out.println("There is no way in hell you are going to put your hand anywhere near its mouth. You're shocked when Cassive reaches towards the monster. You are about to tell them to stop when the monster moves its head towards Cassive's hand and rubs it under their hand like a friendly dog. You're astonished......but now you want to pet the monster too. You hesitantly reach out towards the monster. It seems happy to be pet by both you and Cassive. You both soon realize that this sea monster is just like a dog. You start playing with it.");
          System.out.println(". . .");
          System.out.println("After a while of playing with the sea monster, you decide its getting late and head off to go. Cassive follows. The sea monster looks sad, but waves its head goodbye. Cassive takes you back to the main path after you wring out your clothes.");
          System.out.println(". . .");
          System.out.println("During the walk on the main path, Cassive pointed out a few more species of flora and fauna unique to this island. When you emerge from the jungle, you see that a party is in full swing in the village center. Cassive asks you if you want to join or if you want them to take you back to the boat that will take you home now. (party/boat)");
          choice = scan.nextLine();
          if (choice.toLowerCase().equals("party"))
          {
            party(); //endings
          }
          else //back to boat
          {
            System.out.println("You decide you're exhausted and want to head back to the boat now. Cassive walks you back and you say thank you and goodbye. While on the ride to your homeland, you think about the fun day you had and consider planning another trip to the island.");//ending
          }
        }
      }
      else //bad: monster attacks. Survive monster attack
      {
        System.out.println(roll + " Unlucky!");
        System.out.println("The water moved again in a different place. You start getting nervous. You ask Cassive if they've felt anything. They tell you some movement but that it's probably the water moving from the waterfall hitting it. A few seconds later, the water off to your right erupts and what could only be described as a sea monster. What appears to be its face whips towards you and Cassive. You both are frozen with astonishment and fear. When the sea monster is close, within two arm lengths, it opens its mouth and........lunges for you! This breaks you and Cassive out of your shocked shells and you both run for the beach. The sea monster is snapping at your heels, but you both make it up onto the beach and the monster cannot reach you. Frustrated, it slinks back into the water. Cassive mentions putting a sign up later to block off this path. You silently nod your head, still in shock. Both of you somewhat hurridly go back to the main path.");
        System.out.println(". . .");
        System.out.println("Walking along the main path, you are given time to let your nerves settle. By the time you emerge from the jungle, you have calmed down significantly. You are surprsied to see a party in full swing, not expecting the world to go on like normal around you after your close call. But of course, it did. Cassive breaks the silence you two have been walking in to ask if you want to join the party or go back to the boat. (party/boat)");
        choice = scan.nextLine();
        if (choice.toLowerCase().equals("party"))
        {
          party();//endings
        }
        else //boat
        {
          System.out.println("You tell Cassive that you are still a little too shaken up to party. They tell you they understand and walk you back to the boat, apologising for you having to go through that. You get on the boat and say goodbye to them. On your way home now, you vow never to come back to this island country.");//ending
        }
      }
    }
    else //don't roll: monster doesn't show up
    {
      System.out.println("The movement stills. You look around but find nothing. You assume it must've been your imagination.");
      System.out.println(". . .");
      System.out.println("After standing around and enjoying the waterfall, playing with Cassive, and walking around the pool, you and Cassive decide to get out. You wring out your clothes and Cassive starts leading you back to the main path. Back on the main path, Cassive continues to point out various flora and fauna as you move along the path.");
      System.out.println(". . .");
      System.out.println("At the end of the path, you both emerge from the jungle to find a party in the village center in full swing. Cassive asks if you want to join the party or if you want them to walk you back to the boat that will take you home. (party/boat)");
      choice = scan.nextLine();
      if (choice.toLowerCase().equals("party"))
      {
        party();//endings
      }
      else //back to the boat
      {
        System.out.println("You decide you want to go back to the boat now. You are not feeling a party right now. Cassive walks you back to the boat and you say thank you and goodbye to them. While the boat travels slowly to your homeland, you think about how much fun you had on this trip.");//ending
      }
    }
    //should I write in a cave behind the waterfall?
    
  }//end of wade into waterfall pool

   public static void beachWaterfall() //beach by waterfall path
  {
    String choice = "";
    int roll;
    Scanner scan = new Scanner(System.in);
    System.out.println("You begin to pick your way towards the beach. In no time at all, you're standing on the pebbly, sandy beach. It's soft beneath your feet. Do you want to sit down or wade into the pool? (sit/wade)");
    choice = scan.nextLine();
    if (choice.toLowerCase().equals("sit"))//sit on beach
    {
      System.out.println("You decide to sit down on the beach, plopping down right there. The ground is surprisingly comfotable, considering it is a bunch of small rocks. You invite Cassive to sit down next to you and they plop down as well. You both stare at the beautifully peaceful waterfall cascading down into a mostly still pool.");
      System.out.println(". . .");
      System.out.println("After a while, Cassive asks is you want to wade into the small pool. Do you? (yes/no)");
      choice = scan.nextLine();
      if (choice.toLowerCase().equals("yes"))//wade into pool
      {
        wade();//endings
      }
      else //don't want to wade into pool
      {
        System.out.println("You are of the same opinion as earlier. Even though the pool looks still, you don't want to get wet. Cassive says fair enough and then they ask if you want to head back to the main path now, or wait a little longer. (back/stay)");
        choice = scan.nextLine();
        if (choice.toLowerCase().equals("back"))//back to the main path
        {
          System.out.println("You are ready to head back to the main path now. Cassive leads you back to the main path and the two of you continue through the jungle, looking at all of the unique flora and fauna.");
          System.out.println(". . .");
          System.out.println("Eventually, the two of you emerge to find a party going on in the village center. Cassive asks if you want to join or if you want them to take you back to the boat that will take you back to your home. (party/boat)");
          choice = scan.nextLine();
          if (choice.toLowerCase().equals("party"))
          {
            party();//endings
          }
          else //head back to the boat
          {
            System.out.println("You decide you want to head back to the boat now, too tired for a party. Cassive walks you back to the boat and you say thank you and goodbye to them. Reflecting on the trip while on the way back to your homeland, you think you just might come back.");//ending
          }
        }
        else //stay for a bit longer
        {
          System.out.println("You decide you want to stay a bit longer.");
          System.out.println(". . . ");
          System.out.println("After some time has elapsed, you inform Cassive you want to head back now. They lead you back to the main path and you start walking through the jungle again.");
          System.out.println(". . . ");
          System.out.println("You both emerge from the jungle to see a party in full swing in the village center. Do you want to stay for the party or head back to the boat that will take you to your homeland now? (party/boat)");
          choice = scan.nextLine();
          if (choice.toLowerCase().equals("party"))
          {
            party();//endings
          }
          else //go back to the boat
          {
            System.out.println("You decide you want to retire to the boat now. Cassive walks you to it and you say thank you and goodbye to them. You reflect on your way home, thinking you might come back someday, if only to see that waterfall again.");//ending
          }
        }
      }
    }
    else if (choice.toLowerCase().equals("wade")) //wade into pool
    {
      wade(); //endings
    }
    else //don't choose - stand
    {
      System.out.println("You decide you don't want to do either and instead stand looking at the magnificent waterfall. Cassive joins you and you both get lost in the beauty of it.");
      System.out.println(". . .");
      System.out.println("When the sky begins to darken, you snap out of your trance. You ask Cassive to take you back to the main path. They shake themselves out of their trance and start leading you back to the path.");
      System.out.println(". . .");
      System.out.println("When you emerge from the jungle, you see that there's a party going on in the village center. Do you want to join the party or go back to the boat that will take you to your home? (party/boat)");
      choice = scan.nextLine();
      if (choice.toLowerCase().equals("party"))
      {
        party();//endings
      }
      else
      {
        System.out.println("You decide you want to go back to the boat already. You're tired and it's been a long day. Cassive walks you back to the boat and you say goodbye and thank you. You reflect on the day on the way home and think that the island was beautiful.");//ending
      }
    }
  } //end of beach by waterfall path

  public static void waterfall2() //waterfall path pt.2
  {
    String choice = "";
    int minutes;
    int roll;
    Scanner scan = new Scanner(System.in);
    System.out.println("Cassive was right. The waterfall is stunning! The waterfall itself is around 50ft tall, cascading down in two main streams. At the bottom, where you and Cassive are standing, there is a small pool, mostly sill except for where the water from above crashes down. Surrounding the pool on two sides are the tall cliffs the waterfall comes from, covered with greenery. Another side consists of smaller boulders and rocks, and the final side is a small, pebbly beach. Cassive asks if you want to move closer to the pool. Do you want to, or have you seen enough and want to head back to the main path? (closer/back)");
    choice = scan.nextLine();
    if (choice.toLowerCase().equals("closer")) //closer to pool
    { 
      System.out.println("You decide you want to go closer to the waterfall. It's enchanting and you want to see it up close. Maybe even touch the pool or feel the spray coming off the waterfall itself. Cassive seems excited. They then ask you if you want to climb over the rocks or go down to the beach? (rocks/beach)");
      choice = scan.nextLine();
      if (choice.toLowerCase().equals("rocks")) //climb over rocks
      {
        System.out.println("You aren't one for beaches so you tell Cassive you want to get closer by climbing over the rocks. You move closer and start climbing on them. You notice they are a little slippery from the spray off the waterfall. You can feel the spray on your face. You tilt your face towards the waterfall. Roll to see what happens next. Type 'roll'");
        choice = scan.nextLine();
        if (choice.toLowerCase().equals("roll"))
        {
          roll = (int)(Math.random()*(50)+0);
          if (roll >= 25) //good: you continue with a little slip
          {
            System.out.println(roll + " Congratulations!");
            System.out.println("As you're looking up, you lose your balance for a second and your heart stops, but you regain your balance quickly. You debate getting off for a moment, but you ultimately decide to sit down instead. The rocks are damp beneath you. How much longer do you want to stay looking at the waterfall? (enter a number. It will be in minutes)");
            minutes = scan.nextInt();
            if (minutes >= 60) //stay for long time
            {
              System.out.println("You want to stay for " + minutes + " minutes");
              System.out.println(". . .");
              System.out.println("After " + minutes + " minutes, you look up at the darkening sky and decide it is time to head back. You scramble your way back down the rocks and meet up with Cassive again. They take you back to the main path.");
              System.out.println(". . .");
              System.out.println("You emerge from the jungle to find the village in the midst of a party. Cassive asks if you want to stay for the party or go back to the boat that will take you to your homeland now. (party/boat)");
              choice = scan.nextLine();
              if (choice.toLowerCase().equals("party"))
              {
                party(); //endings
              }
              else
              {
                System.out.println("You decide you're tired and want to head back to the boat now. Cassive walks you to the boat, you say thank you and goodbye, and you board the boat. While on the way back, you think back on your day. It was decently fun. You think you might come back some day."); //endings
              }
            }
            else //stay for little time
            {
              System.out.println("You want to stay for " + minutes + " minutes.");
              System.out.println(". . .");
              System.out.println("After " + minutes + " minutes, you get up and turn around to make your way back down the rocks. When you turn around, you see Cassive staring at you. You start a little because you forgot they were there. You get back to the path and they ask you if you want to head back now or later. (stay/back)");
              choice = scan.nextLine();
              if (choice.toLowerCase().equals("stay")) //stay longer. When get back to main path, the party is in full swing. Start heading back at sunset
              {
                System.out.println("Even though you don't want to get closer, you decide that you don't want to leave this magnificant view just yet. You sit down on the path with Cassive and watch the waterfall.");
                System.out.println(". . .");
                System.out.println("After the sun starts to set, you both decide it's time to head back. You walk back to the main path and then along until you reach the end of the jungle. When you emerge, you find out there's a party is full swing in the village. Cassive asks if you want to stay for the party or head back to the boat that will take you home now? (stay/boat)");
                choice = scan.nextLine();
                if (choice.toLowerCase().equals("stay"))
                {
                  party(); //endings
                }
                else 
                {
                  System.out.println("You decide you have had enough of the island for today and opt to head back to the boat now. Cassive walks you to the boat and you say thank you and goodbye. Reflecting on the day, you think it was pleasant and fulfilling. Maybe you'll come back some day."); //endings
                }
        
              }
              else //go back now. Enter the village when they are setting up for the party
              {
                System.out.println("You decide you've seen enough of the waterfall and you want to head back to the main path now. Cassive, with some resignation, leads you back to the main path. Emerging from the jungle, you see the village is in full bustle and hustle setting up something. You ask Cassive if they know what it is. They say it's probably the party that they have at the end of each tour day. Do you want to stay and help, wait for the party, or head back to the boat that will take you home now? (help/party/boat)");
                choice = scan.nextLine();
                if (choice.toLowerCase().equals("help")) //help set up for the party
                {
                  System.out.println("You decide you want to help set up for the party. Why not? You quickly find people who point you to what you can do. Time flies as you help the villagers prepare for this party. You find youself helping carry a large length of wood and are struggling slightly. Roll the die to see what happens. Type 'roll'");
                  choice = scan.nextLine();
                  if (choice.toLowerCase().equals("roll"))
                  {
                    roll = (int)(Math.random()*(50)+0);
                    if (roll >= 25) //carry the wood and set it down no problem
                    {
                      System.out.println(roll + " Congratulations!");
                      System.out.println("You continue carrying the wood with the other person and you are both relieved when you reach where it will go and set it down. You go off the help out somewhere else.");
                      System.out.println(". . .");
                      System.out.println("After a long day of work, you're tired and unsure if you even want to go to the party you spent hours helping set up. Do you stay for the party, or head back to the boat now? (party/boat)");
                      choice = scan.nextLine();
                      if (choice.toLowerCase().equals("party")) //stay for the party
                      {
                        party();
                      }
                      else //head back home
                      {
                        System.out.println("You decide you're too tired to participate in the party. You say goodbye to the villagers and head back to the boat to your homeland, thinking you might like to come back here again someday."); //end of a story
                      }
                    }
                    else //wood falls and you sprain your wrist. back to doctor's
                    {
                      System.out.println(roll + " Unlucky!");
                      System.out.println("On your way to set the wood down, you lose your grip and drop it. You cry out. The person you were carrying the wood with comes over to help. It looks like you've sprained your wrist. Thankfully, they have a doctor here. You are taken to the doctor’s office.");
                      System.out.println(". . .");
                      System.out.println("After the doctor finishes treating you, you head back outside. The party is all set up now, but after such a long day of work, you're tired and unsure if you even want to go to the party you spent hours helping set up. Do you stay for the party, or head back to the boat now? (party/boat)");
                      choice = scan.nextLine();
                      if (choice.toLowerCase().equals("party")) //stay for the party
                      {
                        party();
                      }
                      else //head back home
                      {
                        System.out.println("You decide you're too tired to participate in the party. You say goodbye to the villagers and head back to the boat to your homeland, thinking you might like to come back here again someday."); //end of a story
                      }
                    }
                  }
                  else //didn't roll. Someone else sees and takes your place
                  {
                    System.out.println("One of the villagers notice you're struggling and offer to carry it instead. You gladly take them up on that and go help out with something else.");
                    System.out.println(". . .");
                    System.out.println("After a long days work, you're tired and unsure if you even want to go to the party you spent hours helping set up. Do you stay for the party, or head back to the boat now? (party/boat)");
                    choice = scan.nextLine();
                    if (choice.toLowerCase().equals("party")) //stay for the party
                    {
                      party();
                    }
                    else //head back home
                    {
                      System.out.println("You decide you're too tired to participate in the party. You say goodbye to the villagers and head back to the boat to your homeland, thinking you might like to come back here again someday."); //end of a story
                    }
                  }
                }
                else if (choice.toLowerCase().equals("party")) //wait for the party to start
                {
                  System.out.println("You want to go to the party, but you don't want to help set it up. You tell Cassive you'll find some place to wait for the party and head off.");
                  System.out.println(". . .");
                  System.out.println("You found a chair off to the side and watched everyone else set up for the party. Just as the sun was going down, the party started up.");
                  party(); //endings
                }
                else //head back to the boat
                {
                  System.out.println("You decide you're too tired and not much of party person, so you want to head back to the boat now. Cassive walks you back to the boat and you thank them and say goodbye. Thinking about your day, you are content with the outcome."); //endings
                }
              } 
            }
          }
          else //bad: hit head
          {
            System.out.println(roll + " Unlucky!");
            System.out.println("You slip on the rocks. You crash to the ground and hit your head on one of the rocks on the way down. Cassive comes running over. Roll to see how bad the damage is. Type 'roll'");
            choice = scan.nextLine();
            if (choice.toLowerCase().equals("roll"))
            {
              roll = (int)(Math.random()*(50)+0);
              if (roll >= 25) //good roll. It's a minor bump, but you still head back to the village
              {
                System.out.println(roll + " Congratulations!");
                System.out.println("Your head is bleeding, but you've retained consciousness. Cassive helps you up and you both decide to head back to the main path and get to the village for medical attention immediately.");
                System.out.println(". . .");
                System.out.println("You spent a few hours in the doctor's office getting fixed up, making light conversation with the resident healer. By the time you're all ready to be released, there's a party starting in the village center. Do you want to join the party or go back to the boat that will take you to your homeland now? (party/boat)");
                choice = scan.nextLine();
                if (choice.toLowerCase().equals("party"))
                {
                  party(); //endings
                }
                else
                {
                  System.out.println("You decide you want to go back to the boat now. You've had enough adventure for the day. Someone walks you back to the boat and you climb aboad, waiting for it to depart. You reflect on you experiences, indecisive of whether you will come back or not"); //ending
                }
              }
              else //bad roll: you die
              {
                System.out.println(roll + " Unlucky!");
                System.out.println("You look up to see three Cassives standing over you. Your head is pounding and swirling and every sound is muffled. Your vision starts going black. You think Cassive is trying to pick you up, but you don't know. Then - everything turns black.");
                System.out.println("You have died."); //ending
              }
            }
            else //don't roll. Cassive tries to carry you, but doesn't make it
            {
              System.out.println("You are barely retaining consciousness. Cassive attempts to put you over their shoulders, but your body feels to heavy to move. You can't help them. All you can do is listen to the muffled sounds of the jungle while your vision blurs and your head pounds and Cassive drags you along the path. At some point, everything fades to nothing.");
              System.out.println("You have died."); //ending
            }
          }
        }
        else //don't roll: continue
        {
          System.out.println("Nothing happens");
          System.out.println("You continue feeling the waterfall spray on your face. It's peaceful here. How long do you want to stay? (enter a number. It will be in minutes)");
          minutes = scan.nextInt();
          if (minutes >= 60) //stay for long time
          {
            System.out.println("You want to stay for " + minutes + " minutes");
            System.out.println(". . .");
            System.out.println("After " + minutes + " minutes, you look up at the darkening sky and decide it is time to head back. You scramble your way back down the rocks and meet up with Cassive again. They take you back to the main path.");
            System.out.println(". . .");
            System.out.println("You emerge from the jungle to find the village in the midst of a party. Cassive asks if you want to stay for the party or go back to the boat that will take you to your homeland now. (party/boat)");
            choice = scan.nextLine();
            if (choice.toLowerCase().equals("party"))
            {
              party(); //endings
            }
            else
            {
              System.out.println("You decide you're tired and want to head back to the boat now. Cassive walks you to the boat, you say thank you and goodbye, and you board the boat. While on the way back, you think back on your day. It was decently fun. You think you might come back some day."); //endings
            }
          }
          else //stay for little time
          {
            System.out.println("You want to stay for " + minutes + " minutes.");
            System.out.println(". . .");
            System.out.println("After " + minutes + " minutes, you get up and turn around to make your way back down the rocks. When you turn around, you see Cassive staring at you. You start a little because you forgot they were there. You get back to the path and they ask you if you want to head back now or later. (stay/back)");
            choice = scan.nextLine();
            if (choice.toLowerCase().equals("stay")) //stay longer. When get back to main path, the party is in full swing. Start heading back at sunset
            {
              System.out.println("Even though you don't want to get closer, you decide that you don't want to leave this magnificant view just yet. You sit down on the path with Cassive and watch the waterfall.");
              System.out.println(". . .");
              System.out.println("After the sun starts to set, you both decide it's time to head back. You walk back to the main path and then along until you reach the end of the jungle. When you emerge, you find out there's a party is full swing in the village. Cassive asks if you want to stay for the party or head back to the boat that will take you home now? (stay/boat)");
              choice = scan.nextLine();
              if (choice.toLowerCase().equals("stay"))
              {
                party(); //endings
              }
              else 
              {
                System.out.println("You decide you have had enough of the island for today and opt to head back to the boat now. Cassive walks you to the boat and you say thank you and goodbye. Reflecting on the day, you think it was pleasant and fulfilling. Maybe you'll come back some day."); //endings
              }
            }
            else //go back now. Enter the village when they are setting up for the party
            {
              System.out.println("You decide you've seen enough of the waterfall and you want to head back to the main path now. Cassive, with some resignation, leads you back to the main path. Emerging from the jungle, you see the village is in full bustle and hustle setting up something. You ask Cassive if they know what it is. They say it's probably the party that they have at the end of each tour day. Do you want to stay and help, wait for the party, or head back to the boat that will take you home now? (help/party/boat)");
              choice = scan.nextLine();
              if (choice.toLowerCase().equals("help")) //help set up for the party
              {
                System.out.println("You decide you want to help set up for the party. Why not? You quickly find people who point you to what you can do. Time flies as you help the villagers prepare for this party. You find youself helping carry a large length of wood and are struggling slightly. Roll the die to see what happens. Type 'roll'");
                  choice = scan.nextLine();
                  if (choice.toLowerCase().equals("roll"))
                  {
                    roll = (int)(Math.random()*(50)+0);
                    if (roll >= 25) //carry the wood and set it down no problem
                    {
                      System.out.println(roll + " Congratulations!");
                      System.out.println("You continue carrying the wood with the other person and you are both relieved when you reach where it will go and set it down. You go off the help out somewhere else.");
                      System.out.println(". . .");
                      System.out.println("After a long day of work, you're tired and unsure if you even want to go to the party you spent hours helping set up. Do you stay for the party, or head back to the boat now? (party/boat)");
                      choice = scan.nextLine();
                      if (choice.toLowerCase().equals("party")) //stay for the party
                      {
                        party();
                      }
                      else //head back home
                      {
                        System.out.println("You decide you're too tired to participate in the party. You say goodbye to the villagers and head back to the boat to your homeland, thinking you might like to come back here again someday."); //end of a story
                      }
                    }
                    else //wood falls and you sprain your wrist. back to doctor's
                    {
                      System.out.println(roll + " Unlucky!");
                      System.out.println("On your way to set the wood down, you lose your grip and drop it. You cry out. The person you were carrying the wood with comes over to help. It looks like you've sprained your wrist. Thankfully, they have a doctor here. You are taken to the doctor’s office.");
                      System.out.println(". . .");
                      System.out.println("After the doctor finishes treating you, you head back outside. The party is all set up now, but after such a long day of work, you're tired and unsure if you even want to go to the party you spent hours helping set up. Do you stay for the party, or head back to the boat now? (party/boat)");
                      choice = scan.nextLine();
                      if (choice.toLowerCase().equals("party")) //stay for the party
                      {
                        party();
                      }
                      else //head back home
                      {
                        System.out.println("You decide you're too tired to participate in the party. You say goodbye to the villagers and head back to the boat to your homeland, thinking you might like to come back here again someday."); //end of a story
                      }
                    }
                  }
                  else //didn't roll. Someone else sees and takes your place
                  {
                    System.out.println("One of the villagers notice you're struggling and offer to carry it instead. You gladly take them up on that and go help out with something else.");
                    System.out.println(". . .");
                    System.out.println("After a long days work, you're tired and unsure if you even want to go to the party you spent hours helping set up. Do you stay for the party, or head back to the boat now? (party/boat)");
                    choice = scan.nextLine();
                    if (choice.toLowerCase().equals("party")) //stay for the party
                    {
                      party();
                    }
                    else //head back home
                    {
                      System.out.println("You decide you're too tired to participate in the party. You say goodbye to the villagers and head back to the boat to your homeland, thinking you might like to come back here again someday."); //end of a story
                    }
                  }
              }
              else if (choice.toLowerCase().equals("party")) //wait for the party to start
              {
                System.out.println("You want to go to the party, but you don't want to help set it up. You tell Cassive you'll find some place to wait for the party and head off.");
                System.out.println(". . .");
                System.out.println("You found a chair off to the side and watched everyone else set up for the party. Just as the sun was going down, the party started up.");
                party(); //endings
              }
              else //head back to the boat
              {
                System.out.println("You decide you're too tired and not much of party person, so you want to head back to the boat now. Cassive walks you back to the boat and you thank them and say goodbye. Thinking about your day, you are content with the outcome."); //endings
              }
            } 
          }
        }
      }
      else //beach
      {
        System.out.println("You decide you want to go down to the beach to get a closer view instead of the rocks.");
       beachWaterfall(); //endings
      }
    }
    else if (choice.toLowerCase().equals("back"))//if not closer than go back to the main path
    {
      System.out.println("You decide you don't want to get closer to the waterfall. But do you want to stay longer to look at it, or head back to the main path now? (stay/back)");
      choice = scan.nextLine();
      if (choice.toLowerCase().equals("stay")) //stay longer. When get back to main path, the party is in full swing. Start heading back at sunset
      {
        System.out.println("Even though you don't want to get closer, you decide that you don't want to leave this magnificant view just yet. You sit down on the path with Cassive and watch the waterfall.");
        System.out.println(". . .");
        System.out.println("After the sun starts to set, you both decide it's time to head back. You walk back to the main path and then along until you reach the end of the jungle. When you emerge, you find out there's a party is full swing in the village. Cassive asks if you want to stay for the party or head back to the boat that will take you home now? (stay/boat)");
        choice = scan.nextLine();
        if (choice.toLowerCase().equals("stay"))
        {
          party(); //endings
        }
        else 
        {
          System.out.println("You decide you have had enough of the island for today and opt to head back to the boat now. Cassive walks you to the boat and you say thank you and goodbye. Reflecting on the day, you think it was pleasant and fulfilling. Maybe you'll come back some day."); //endings
        }
      }
      else //go back now. Enter the village when they are setting up for the party
      {
        System.out.println("You decide you've seen enough of the waterfall and you want to head back to the main path now. Cassive, with some resignation, leads you back to the main path. Emerging from the jungle, you see the village is in full bustle and hustle setting up something. You ask Cassive if they know what it is. They say it's probably the party that they have at the end of each tour day. Do you want to stay and help, wait for the party, or head back to the boat that will take you home now? (help/party/boat)");
        choice = scan.nextLine();
        if (choice.toLowerCase().equals("help")) //help set up for the party
        {
          System.out.println("You decide you want to help set up for the party. Why not? You quickly find people who point you to what you can do. Time flies as you help the villagers prepare for this party. You find youself helping carry a large length of wood and are struggling slightly. Roll the die to see what happens. Type 'roll'");
                  choice = scan.nextLine();
                  if (choice.toLowerCase().equals("roll"))
                  {
                    roll = (int)(Math.random()*(50)+0);
                    if (roll >= 25) //carry the wood and set it down no problem
                    {
                      System.out.println(roll + " Congratulations!");
                      System.out.println("You continue carrying the wood with the other person and you are both relieved when you reach where it will go and set it down. You go off the help out somewhere else.");
                      System.out.println(". . .");
                      System.out.println("After a long day of work, you're tired and unsure if you even want to go to the party you spent hours helping set up. Do you stay for the party, or head back to the boat now? (party/boat)");
                      choice = scan.nextLine();
                      if (choice.toLowerCase().equals("party")) //stay for the party
                      {
                        party();
                      }
                      else //head back home
                      {
                        System.out.println("You decide you're too tired to participate in the party. You say goodbye to the villagers and head back to the boat to your homeland, thinking you might like to come back here again someday."); //end of a story
                      }
                    }
                    else //wood falls and you sprain your wrist. back to doctor's
                    {
                      System.out.println(roll + " Unlucky!");
                      System.out.println("On your way to set the wood down, you lose your grip and drop it. You cry out. The person you were carrying the wood with comes over to help. It looks like you've sprained your wrist. Thankfully, they have a doctor here. You are taken to the doctor’s office.");
                      System.out.println(". . .");
                      System.out.println("After the doctor finishes treating you, you head back outside. The party is all set up now, but after such a long day of work, you're tired and unsure if you even want to go to the party you spent hours helping set up. Do you stay for the party, or head back to the boat now? (party/boat)");
                      choice = scan.nextLine();
                      if (choice.toLowerCase().equals("party")) //stay for the party
                      {
                        party();
                      }
                      else //head back home
                      {
                        System.out.println("You decide you're too tired to participate in the party. You say goodbye to the villagers and head back to the boat to your homeland, thinking you might like to come back here again someday."); //end of a story
                      }
                    }
                  }
                  else //didn't roll. Someone else sees and takes your place
                  {
                    System.out.println("One of the villagers notice you're struggling and offer to carry it instead. You gladly take them up on that and go help out with something else.");
                    System.out.println(". . .");
                    System.out.println("After a long days work, you're tired and unsure if you even want to go to the party you spent hours helping set up. Do you stay for the party, or head back to the boat now? (party/boat)");
                    choice = scan.nextLine();
                    if (choice.toLowerCase().equals("party")) //stay for the party
                    {
                      party();
                    }
                    else //head back home
                    {
                      System.out.println("You decide you're too tired to participate in the party. You say goodbye to the villagers and head back to the boat to your homeland, thinking you might like to come back here again someday."); //end of a story
                    }
                  }
        }
        else if (choice.toLowerCase().equals("party")) //wait for the party to start
        {
          System.out.println("You want to go to the party, but you don't want to help set it up. You tell Cassive you'll find some place to wait for the party and head off.");
          System.out.println(". . .");
          System.out.println("You found a chair off to the side and watched everyone else set up for the party. Just as the sun was going down, the party started up.");
          party(); //endings
        }
        else //head back to the boat
        {
          System.out.println("You decide you're too tired and not much of party person, so you want to head back to the boat now. Cassive walks you back to the boat and you thank them and say goodbye. Thinking about your day, you are content with the outcome."); //endings
        }
      }
    }
    else //can't decide: Cassive suggests going down to the beach to get a better view.
    {
      System.out.println("You can't decide if you want to get closer or not. Cassive suggests going down to the beach. They mention that they really like this beach, and you agree to go down.");
      beachWaterfall(); //endings
    }
  } //end of waterfall path pt.2

  public static void waterfall() //waterfall path from inland tour w/ guide
  {
    String choice = "";
    int roll;
    Scanner scan = new Scanner(System.in);
    System.out.println("This path is narrower and you frequently have to step over and duck under tree branches. Cassive carries along pointing out any new plants or animals. They stop under a tree stretched over the path and point out a small, brightly colored flying beetle. They tell you to not be worried about the color, this is a Cyon, and they use the colors to ward off predators, but they are non-toxic. Cassive asks if you want to hold the beetle about the size of a finger. Do you want to? (yes/no)");
    choice = scan.nextLine();
    if (choice.toLowerCase().equals("yes")) //hold beetle
    {
      System.out.println("You tell Cassive you do want to hold the Cyon and they hand it to you. It feels oddly comforting. Its legs are fuzzy as they softly pass over your hand. You originally thought the beetle had four legs but now you realize it has eight. You gently pet its smooth, waxy wings. After about 10 minutes, you hand the beetle back to Cassive so they can put it back on the tree. You both move on along the path.");
      System.out.println(". . .");
      System.out.println("About a half an hour further down the path, Cassive informs you that you guys are almost there. You're super excited and end up tripping over a tree branch in the path. Roll to see what happens next. Type 'roll''");
      choice = scan.nextLine();
      if (choice.toLowerCase().equals("roll")) 
      {
        roll = (int)(Math.random()*(50)+0);
        if (roll >= 25) // good roll: just stumble
        {
          System.out.println(roll + " Congratulations!");
          System.out.println("You stumble a bit over the tree branch, but catch yourself before you fall. You look up and shyly apologize to Cassive for the delay. They reassure you and you both continue down the path. A couple minutes later, you arrive at the waterfall.");
          waterfall2();
        }
        else //bad roll: trip and fall, but Cassive helps you up, no damage done
        {
          System.out.println(roll + " Unlucky!");
          System.out.println("You stumble and fall to the ground. Cassive reaches down and helps you up. You dust yourself off, no worse for wear except for some wounded pride and dignity. You apologize to Cassive for the delay and you both start along the path again. A couple minutes later, you arrive at the waterfall.");
          waterfall2();
        }
      }
    }
    else if (choice.toLowerCase().equals("no")) //don't hold beetle
    {
      System.out.println("You tell Cassive you would rather not hold the weird-looking beetle. Even though they told you it wasn't dangerous, you are still a little weary. They said suit yourself, put the beetle back on the tree, and carry on with the tour. You careful duck under the tree. Roll to see what happens next. Type 'roll'"); 
      choice = scan.nextLine();
      if (choice.toLowerCase().equals("roll")) 
      {
        roll = (int)(Math.random()*(50)+0);
        if (roll >= 25) //good: make it under with no problems
        {
          System.out.println(roll + " congratulations!");
          System.out.println("You pass under the tree with no issues, following Cassive down the path again. ");
          System.out.println(". . .");
          System.out.println("About a half an hour further down the path, Cassive informs you that you guys are almost there. You're super excited and end up tripping over a tree branch in the path. Roll to see what happens next. Type 'roll''");
          choice = scan.nextLine();
          if (choice.toLowerCase().equals("roll")) 
          {
            roll = (int)(Math.random()*(50)+0);
            if (roll >= 25) // good roll: just stumble
            {
              System.out.println(roll + " Congratulations!");
              System.out.println("You stumble a bit over the tree branch, but catch yourself before you fall. You look up and shyly apologize to Cassive for the delay. They reassure you and you both continue down the path. A couple minutes later, you arrive at the waterfall.");
              waterfall2();
            }
          }
          else //bad roll: trip and fall, but Cassive helps you up, no damage done
          {
            System.out.println(roll + " Unlucky!");
            System.out.println("You stumble and fall to the ground. Cassive reaches down and helps you up. You dust yourself off, no worse for wear except for some wounded pride and dignity. You apologize to Cassive for the delay and you both start along the path again. A couple minutes later, you arrive at the waterfall.");
            waterfall2();
          }
        }
        else //bad: beetle falls on you, you freak out, Cassive calms you down, and puts the beetle back
        {
          System.out.println(roll + " Unlucky!");
          System.out.println("As you are walking under the tree, you feel a thump on your back. And then the object moves. You start to scream and freak out while Cassive tries to calm you down. They keep saying it's only the beetle, but that freaks you out more. Finally, after a huge scuffle, Cassive is able to grab the beetle off your back and put it back on the tree. You scramble away and shake yourself off. You beg Cassive to continue on with the tour. They laugh a little under their breath, but continue on.");
          System.out.println(". . .");
          System.out.println("About a half an hour further down the path, Cassive informs you that you guys are almost there. You're super excited and end up tripping over a tree branch in the path. Roll to see what happens next. Type 'roll''");
          choice = scan.nextLine();
          if (choice.toLowerCase().equals("roll")) 
          {
            roll = (int)(Math.random()*(50)+0);
            if (roll >= 25) // good roll: just stumble
            {
              System.out.println(roll + " Congratulations!");
              System.out.println("You stumble a bit over the tree branch, but catch yourself before you fall. You look up and shyly apologize to Cassive for the delay. They reassure you and you both continue down the path. A couple minutes later, you arrive at the waterfall.");
              waterfall2();
            }
            else //bad roll: trip and fall, but Cassive helps you up, no damage done
            {
              System.out.println(roll + " Unlucky!");
              System.out.println("You stumble and fall to the ground. Cassive reaches down and helps you up. You dust yourself off, no worse for wear except for some wounded pride and dignity. You apologize to Cassive for the delay and you both start along the path again. A couple minutes later, you arrive at the waterfall.");
              waterfall2();
            }
          }
        }
      }
      else //don't roll: you sprint under the tree. Cassive looks at you curiously, but makes no comment.
      {
        System.out.println("You are paranoid about the beetle falling on you, so you sprint under the tree. Cassive looks at you curiously but makes no comment. The both of you continue on the path");
        System.out.println(". . .");
        System.out.println("About a half an hour further down the path, Cassive informs you that you guys are almost there. You're super excited and end up tripping over a tree branch in the path. Roll to see what happens next. Type 'roll''");
        choice = scan.nextLine();
        if (choice.toLowerCase().equals("roll")) 
        {
          roll = (int)(Math.random()*(50)+0);
          if (roll >= 25) // good roll: just stumble
          {
            System.out.println(roll + " Congratulations!");
            System.out.println("You stumble a bit over the tree branch, but catch yourself before you fall. You look up and shyly apologize to Cassive for the delay. They reassure you and you both continue down the path. A couple minutes later, you arrive at the waterfall.");
            waterfall2();
          }
          else //bad roll: trip and fall, but Cassive helps you up, no damage done
          {
            System.out.println(roll + " Unlucky!");
            System.out.println("You stumble and fall to the ground. Cassive reaches down and helps you up. You dust yourself off, no worse for wear except for some wounded pride and dignity. You apologize to Cassive for the delay and you both start along the path again. A couple minutes later, you arrive at the waterfall.");
            waterfall2();
          }
        }
      }
    }
    else //don't roll and not hold beetle, but touch it
    {
      System.out.println("You can't decide yes or no. It looks fascinating, but you don't want to hold it. So Cassive holds it while you touch the beautiful beetle. It has a smooth texture. After a couple minutes of marveling, Cassive puts the beetle back and moves on with the tour.");
      System.out.println(". . .");
      System.out.println("About a half an hour further down the path, Cassive informs you that you guys are almost there. You're super excited and end up tripping over a tree branch in the path. Roll to see what happens next. Type 'roll''");
      choice = scan.nextLine();
      if (choice.toLowerCase().equals("roll")) 
      {
        roll = (int)(Math.random()*(50)+0);
        if (roll >= 25) // good roll: just stumble
        {
          System.out.println(roll + " Congratulations!");
          System.out.println("You stumble a bit over the tree branch, but catch yourself before you fall. You look up and shyly apologize to Cassive for the delay. They reassure you and you both continue down the path. A couple minutes later, you arrive at the waterfall.");
          waterfall2();
        }
        else //bad roll: trip and fall, but Cassive helps you up, no damage done
        {
          System.out.println(roll + " Unlucky!");
          System.out.println("You stumble and fall to the ground. Cassive reaches down and helps you up. You dust yourself off, no worse for wear except for some wounded pride and dignity. You apologize to Cassive for the delay and you both start along the path again. A couple minutes later, you arrive at the waterfall.");
          waterfall2();
        }
      }
    }
  } //end of waterfall path from inland tour w/ guide

  public static void inlandPathTour2() //inland path part 2 w/ tour guide
  {
    String choice = "";
    int roll;
    Scanner scan = new Scanner(System.in);
    System.out.println("You move on with Cassive as they continue telling you about the jungle.");
    System.out.println(". . .");
    System.out.println("After about an hour of wallking with Cassive pointing out the various plants and animals and explaining them when you ask, Cassive suddenly stops. They pull to the side of the path and ask if you want to take a side trail that leads to a beautiful waterfall. Do you want to head off the main path to see the waterfall or stay and continue on the main path? (waterfall/stay)");
    choice = scan.nextLine();
    if (choice.toLowerCase().equals("waterfall")) //head to waterfall
    {
      System.out.println("You decide that since it's the tour guide suggesting leaving the path, you want to go see the waterfall. Cassive is excited and starts down the path, beckoning you to follow them.");
      waterfall();
    }
    else if (choice.toLowerCase().equals("stay")) //stay on main path
    {
      System.out.println("You tell Cassive you want to stay on the main path. They seem disappointed, but carry on with the main tour none the less.");
      System.out.println(". . .");
      System.out.println("After a few hours, you and Cassive emerge from the jungle at night to see the village in the midst of a celebration. Cassive invites you to join. Do you want to stay for the party or go back to the boat that will take you to your homeland? (party/boat)");
      choice = scan.nextLine();
      if (choice.toLowerCase().equals("party")) //want to stay for the party
      {
        party(); //endings
      }
      else 
      {
        System.out.println("You decide you want to retire already. You had a long day. Cassive escorts you back to the boat and you thank them for the wonderful tour. While on the boat, you reflect about your experiences and are satisfied with the tour you went on today."); //end of a story
      }
    }
    else //indecision so Cassive makes choice for you to go to the waterfall
    {
      System.out.println("You can't decide which path you want to take, so Cassive enthusiastically suggests the waterfall path. You figure why not. And it should be safe since Cassive is so sure about it. You agree to let them lead you and the two of you start down the path.");
      waterfall();
    }
  } //end of inland path part 2 w/ tour guide
  
  //main method
  public static void main(String[] args) 
  {
    Scanner scan = new Scanner(System.in);
    int roll;
    System.out.println("------------------------");
    System.out.println("*INSTRUCTIONS*");
    System.out.println("**** Hello Player! This is a choose-your-own adventure story game. Answer the questions when presented to you with your desired choice. The question will give you your answer choices. Make sure to type in exactly what you want. Capitalization doesn't matter, but misspellings might change your choice. At certain parts throughout the story, it will ask you to roll a 'die'. The rolls are games of chance. After your roll, the game will display the result of your roll and whether it is good or bad, signifyed by a 'Congratulations!' or 'Unlucky!' The story will then continue. Have fun playing and remember, there are many different pathways and endings, so play multiple times if you want! Good luck! ****");
    System.out.println("------------------------");
    System.out.println("Hello! Welcome to Simbia! We have two distinct biomes here to explore.");
    /*System.out.println("Please enjoy you travels and stay in our country! We have two distinct biomes in our wonderful island country. Before you go, a warning: don't stray far from the predefined paths. Enjoy yourself out there!");*/
    System.out.println("Would you like a tour guide on your travels through our wonderful island country? (y/n)"); //first question
    String choice = scan.nextLine();
    if (choice.toLowerCase().equals("y")) //tour guide path
    {
      System.out.println("Wonderful! We're happy to provide you with a tour guide for the duration of your stay!");
        System.out.println("Would you like the coastal tour with Garia, or the inland tour with Cassive? (coast/inland)");
        choice = scan.nextLine();
        if (choice.toLowerCase().equals("coast")) //coastal tour
        {
          System.out.println("Very well! Please follow Garia for the duration of your tour! Remember, don't stray from the path :)");
          System.out.println("You start out along a coastal path with Garia. They start off by telling you the history of the island country as you walk along the rocky, sandy, path.");
          System.out.println(". . .");
          System.out.println("The two of you reach a scenic overlook and Garia asks if you want to check it out. Do you want to see the overlook, or continue on the tour? (overlook/continue)");
          choice = scan.nextLine();
          if (choice.toLowerCase().equals("overlook"))//go see the overlook
          {
            System.out.println("You decide you want to see why someone would put a scenic overlook here and tell your tour guide that. The two of you walk around the beautiful overhang, examining the view. You spot a small sandy beach below. Do you want to ask if there's a path down to the beach? (ask/ignore)");
            choice = scan.nextLine();
            if (choice.toLowerCase().equals("ask"))//see if you can go down to the beach
            {
              System.out.println("You ask Garia if there is a way to get down to the beach. They say that there is, but you guys are not going down there. Do you want to ask what the reason is? (ask/move on)");
              choice = scan.nextLine();
              if (choice.toLowerCase().equals("ask"))//ask about beach
              {
                System.out.println("You ask why you can't go down to the beach. Garia starts explaining the dangerous history of that beach while leading you back onto the path. There have been a large number of disappearances from that beach and no one - or body - has been recovered. You are suddenly glad you had a tour guide hear to warn you about that. Otherwise, you might've tried to go down to the beach and become a disappearance yourself!");
                coastalPath2Tour();
              }
              else //accept that you won't go to the beach and move on
              {
                System.out.println("As curious as you are to know why, you decide to just let it go and continue on with the tour. Garia starts leading you down the path again.");
                coastalPath2Tour();
              }
            }
            else //ignore the beach and continue on
            {
              System.out.println("You've never really liked the beach, so you decide to ignore it and continue listening to Garia as they tell you why the overlook was originally built here, and the repairs that it has undergone. You eventually continue along the coastal path, ready to see more of the tour.");
              coastalPath2Tour();
            }
          }
          else //continue with the tour
          {
            System.out.println("You're not overly thrilled with the idea of checking out the overlook, so you tell Garia that you just want to continue on with the tour.");
            coastalPath2Tour();
          }
        }
        else //inland tour
        {
          //a path that leads to a beautiful waterfall scene
          //wander off from tour guide
          System.out.println("Fantastic! You will be following Cassive for the entirety of your inland tour. Please don't stray from the path!");
          System.out.println("You meet up with Cassive and they start leading you into the jungle, beginning the tour by telling you the history of the island and how it came to have a sprawling jungle in the middle of it and a beautiful coast.");
          System.out.println(". . .");
          System.out.println("You are enjoying your tour so far when you see a gorgeous plant. You ask Cassive what it is and if you can touch it. They smile at you and say it's a Gympie-Gympie. Which sounds cute, but it'd be a really bad idea to touch it. Do you want to ask Cassive why it's a bad idea to touch the plant? It looks so inviting with its broad, fuzzy leaves. (ask/don't)"); 
          choice = scan.nextLine();
          if (choice.toLowerCase().equals("ask"))//ask Cassive about the plant
          {
            //they tell you the dangers and you are grateful you listened to them and they stopped you before you touched it
            System.out.println("You are curious as to how something that looks and sounds so cute can be a bad idea to touch, so you ask Cassive to explain it to you. They proceed to tell you the horrifying truth of this deceptive little plant. The Gympie-Gympie is also known as the stinging tree or the Suicide Plant. It is known this way because of the hairs that adorn every part of the bush. These hairs break off and attach to anything with the slightest brush (they also float around the bush in the air) and deliver a potent neurotoxin that causes excruciating pain and swell up your lymph nodes. The effects last for weeks and can last for months or even years. It has driven people to suicide, hence the forboding name. Once Cassive finishes telling you this information, you quickly move to the other side of the path, thank Cassive for stopping you, and ask to move on with the tour. A shudder goes through you at the thought that you could've gone through that.");
            // inland path part two w/ tour guide;
            inlandPathTour2();
          }
          else //don't ask why it's a bad idea to touch the plant
          {
            System.out.println("You aren't curious enough to ask Cassive why you shouldn't touch the Gympie-Gympie. You figure, with a name like that, it can't be that bad. Do you want to touch it despite Cassive's warning? (yes/no)");
            choice = scan.nextLine();
            if (choice.toLowerCase().equals("yes"))//touch the plant
            {
              System.out.println("You ignore Cassive's warning. Besides, the plant has a cute name and cute features, Cassive is probably just messing with you about it being dangerous. You reach out and brush the Gympie-Gympie. Immediately, your hand breaks out into excruciating, nauseating pain and starts whitening and swealling where you touched the plant. You let out a piercing scream and that gets Cassive's attention, who was already further down the path. They run back and sees your hand. Immediately, they tell you not to rub or itch it or touch anything else to it. Then they start rushing you to a doctor. While you're rushing along, you trip over a rock and fall. Roll to see what happens. Type 'roll'");
              choice = scan.nextLine();
              if (choice.toLowerCase().equals("roll"))
              {
                roll = (int)(Math.random()*(50)+0);
                if (roll >= 25)//good roll: you get up and continue
                {
                  System.out.println(roll + " Congratulations!");
                  System.out.println("You crash into the jungle floor but are unharmed besides some minor scapes and bruises. Cassive pulls you up - careful not to touch your hand - and continues rushing you along.");
                  System.out.println(". . .");
                  System.out.println("Cassive was able to get you to a doctor and the doctor treated you. You are now in the doctor's office with only minor pain coming from your wrapped hand, and bandages covering the scrapes you picked up. While you are now fine - relatively - you want to end your tour here. You decide to get someone to take you back to the boat that will take you to your homeland. As you board, you swear you are never coming back.");//end of a story
                }
                else //bad roll: sprain your ankle.
                {
                  System.out.println(roll + " Unlucky!");
                  System.out.println("When you fell, you sprained your ankle. Cassive drags you up while carefully avoiding your hand and helps you along the path. It's slower progress, but you eventually make it to the doctor's office.");
                  System.out.println(". . .");
                  System.out.println("After your treatment, your pain is managable (but not ignorable) and you decide you want to end your tour early and go home. Someone walks you to the boat that will take you back to your homeland, and as the boat is leaving, you swear to never come back to this island you were once so excited to visit.");//end of a story
                }
              }
              else //don't roll: just lie there and pass out from the pain
              {
                System.out.println("When you fell, you gave up. You were in so much pain that you couldn't hold on to consciousness. Roll to see what happens next. Type 'roll'");
                choice = scan.nextLine();
                if (choice.toLowerCase().equals("roll"))
                {
                  roll = (int)(Math.random()*(50)+0);
                  if (roll >= 25)//good roll: Cassive carries you to medical help
                  {
                    System.out.println(roll + " Congratulations!");
                    System.out.println("*You wake up laying on a hospital bed/cot with no idea what happend* When you ask, the doctor said Cassive carried you all the way here to get treatment. Do you want to summon Cassive over and thank them yourself, or tell the doctor to do it? (yourself/doctor)");
                    choice = scan.nextLine();
                    if (choice.toLowerCase().equals("yourself"))//thank Cassive yourself
                    {
                      System.out.println("You have someone get Cassive so that you can thank them. After, you get a guide back to the boat so you can go home. You're sick of this island because of this experience and just want to leave. You board the boat that will take you back to your homeland.");//end of a story
                    }
                    else //tell doctor to thank Cassive for your
                    {
                      System.out.println("You tell the doctor to thank Cassive for you and inform the doctor that you want to go home. They get you a guide back to the boat that will take you to your homeland. After your experience here, you hope you never have to come back. You board the boat without a second glanse.");//end of a story
                    }
                  }
                  else //bad roll: you die
                  {
                    System.out.println(roll + " Unlucky!");
                    System.out.println("*You laid on that floor and never woke up. Cassive couldn't help you. You died there*");//end of a story
                  }
                }
                else //don't roll and die
                {
                  System.out.println("You don't even want to try to save yourself. You die on that jungle floor."); //end of a story
                }
              }
            }
            else //don't touch the plant anyway
            {
              System.out.println("Even though it doesn't sound intimidating, you figure you better listen to Cassive and not touch the plant. They are a tour guide for a reason afterall. You catch back up with Cassive to continue the tour");
              //inland tour part 2 w/ tour guide;
              inlandPathTour2();
            }
          }
          
        }
    }
    else //no tour guide path
    {
      System.out.println("Okay, if that's how you want to explore. But I'm warning you, don't stray too far from the predefined paths");
      System.out.println("Do you start walking inland to the jungle, or take the coastal routes? (inland/coast)");
      choice = scan.nextLine();
      if (choice.toLowerCase().equals("inland")) //inland w/o guide
      {
        System.out.println("You start walking into the lush jungle, alight with the noises of nature.");
        System.out.println("You soon spot a colorful lizard species that you've never seen before. Do you stop to photograph or sketch it, or move past it? (stop/move)");
        choice = scan.nextLine();
        if (choice.toLowerCase().equals("stop"))//stop for lizard
        {
          System.out.println("You stop to photograph or sketch the colorful lizard sitting on the tree. While you're entirely enraptured with this new found lizard, something lands on your arm. Do you brush it off, or ignore it? (brush/ignore)");
          choice = scan.nextLine();
          if (choice.toLowerCase().equals("brush"))//avoided bite
          {
            System.out.println("You brush off the mysterious creature and continue interacting with the lizard. After a few more moments, you're ready to move on. Traveling through the jungle, you get distracted by a new plant species. It's a little off the path, but you want to go photograph/sketch this plant. Should you stay on the path, or stray? (stay/stray)");
            choice = scan.nextLine();
            if (choice.toLowerCase().equals("stay"))//stay on path
            {
              System.out.println("You heed the warning to stay on the path and sketch/photograph the plant from a distance. Once you are done, you continue on your way through the jungle. You emerge to a festival on the other side of the island. Do you want to go home, or stay for the festivities? (home/stay)");
              choice = scan.nextLine();
              if (choice.toLowerCase().equals("home"))//go home
              {
                System.out.println("You are tired from your traverse through the jungle. You decide to take a ride back to the port and board the boat to go back to your homeland immediately."); //end of a story
              }
              else //stay for the party
              {
                party();
              }
            }
            else //check out plant
            {
              System.out.println("You decide to go check out this new plant. You have a grand 'ol time sketching/photographing the plant, but when you turn to go back, you can't see the path anymore. Roll to see what happens next. Type 'roll'");
              choice = scan.nextLine();
              if (choice.toLowerCase().equals("roll"))
              {
                roll = (int)(Math.random()*(50)+0);
                if (roll >= 25) //find path in few steps
                {
                  System.out.println(roll + " Congratulations!");
                  System.out.println("You stumble around for a few moments, trying to retrace you steps. You luckly find the path not too far away and decide to stay on it through the rest of the jungle. You emerge to a festival on the other side of the island. Do you want to go home, or stay for the festivities? (home/stay)");
                  choice = scan.nextLine();
                  if (choice.toLowerCase().equals("home"))//go home
                  {
                    System.out.println("You are tired from your traverse through the jungle. You decide to take a ride back to the port and board the boat to go back to your homeland immediately."); //end of a story
                  }
                  else //stay for the party
                  {
                    party();
                  }
                }
                else //bad roll: get lost and die
                {
                  System.out.println(roll + " Unlucky!");
                  System.out.println("You stumble around for minutes, which turn into hours, which turn into days. You've lost the path entirely. You end up dying in the wilderness, finally remembering the warning to not stray from the path.");//end of a story
                }
              }
              else //give up on finding path
              {
                System.out.println("You figure it's fine. You stay by the plant and wait for someone to find you and lead you back to the path and out of the jungle. No one does. You die alone, filled with regret about your choices.");//end of a story
              }
            }
          }
          else //mysterious creature bites
          {
            System.out.println("You ignore the mysterious creature that landed on your arm in favor of focusing on your work with the lizard. You feel a sharp prick. The creature bit you! You brush it away and examine the bite. It doesn't look bad, but you don't know how dangerous the flora and fauna are in this island country. Do you seek medical attention, or carry on with your self-guided tour? (help/continue)");
            choice = scan.nextLine();
            if (choice.toLowerCase().equals("help"))//help for bite
            {
              System.out.println("You decide to have the bite examined by a local doctor, just in case. Moving back to the path, you follow it until you emerge from the jungle into a village. Everyone seems busy - they look like they're preparing for a festival or something tonight - but you manage to get someone to point you towards the doctor. When you step into the doctor's office, you find a simple, clean waiting room with a receptionist's desk and a single door to what you assume is the treatment room. The doctor comes out of the room, escorting another patient out who look like they have an injured wrist, and smiles at you. The doctor waves you in and asks you what you're here for. When you show them the bite, you realize it looks much worse now. The doctor informs you that you were bit by a mangoloose, and that you probably would've died from the bite if you hadn't seeked treatment. They finish treating you and show you out of the room. You ask what the village is getting ready for. The doctor informs you that there will be a party later tonight for the visiters. They tell you that you can stay and wait until the party if you want. You could also help set up. Do you decide to wait in the doctor's office, or go help out? (stay/help)");
              choice = scan.nextLine();
              if (choice.toLowerCase().equals("stay"))//stay in doctor's office
              {
                System.out.println("You decide to wait in the doctor's office until the party starts, already worn out from the shocking news of your near death experience. Sitting in the waiting room, you start looking for something to do. Roll the die to see what you find. Type 'roll'");
                choice = scan.nextLine();
                if (choice.toLowerCase().equals("roll"))
                {
                  roll = (int)(Math.random()*(50)+0);
                  if (roll >= 25) //find a magazine to read
                  {
                    System.out.println(roll + " Congratulations!");
                    System.out.println("You find a magazine laying around in the waiting room and pick it up to read. It's rather interesting.");
                    System.out.println(". . .");
                    System.out.println("You've successfully passed the time until the party started, but you're unsure whether you actually want to go to the party. You are really tired afterall. Do you want to stay for the party, or head back to the boat that will take you home? (stay/boat)");
                    choice = scan.nextLine();
                    if (choice.toLowerCase().equals("stay"))//stay for the party
                    {
                      party();
                    }
                    else //head back home
                    {
                      System.out.println("You decide you're too tired to stay so you head back to the boat that will take you to your homeland.");//end of a story
                    }
                  }
                  else //get bored and wander around, getting dragged into helping
                  {
                    System.out.println(roll + " Unlucky!");
                    System.out.println("After looking around for a few minutes, you can't find anything to hold your attention in the doctor's office, so you decide to wander around outside.");
                    System.out.println(". . .");
                    System.out.println("After resisting several attempt, the villagers finally convince you to help with the preparations for the party.");
                    System.out.println(". . .");
                    System.out.println("The party is all set up now, but you're tired and unsure if you even want to go to the party you just spent time helping set up. Do you stay for the party, or head back to the boat now? (party/boat)");
                    choice = scan.nextLine();
                    if (choice.toLowerCase().equals("party")) //stay for the party
                    {
                      party();
                    }
                    else //head back home
                    {
                      System.out.println("You decide you're too tired to participate in the party. You thank the villagers and head back to the boat to your homeland."); //end of a story
                    }
                  }
                }
                else //don't roll. stay at the wall
                {
                  System.out.println("You decide to just stay at the wall until the party is done being set up.");
                  System.out.println(". . .");
                  System.out.println("You see that the party is done being set up, but you're kind of tired. Do you stay for the party or head back to the boat now? (stay/boat)");
                  choice = scan.nextLine();
                  if (choice.toLowerCase().equals("stay")) //stay for the party
                  {
                    party();
                  }
                  else //head back home
                  {
                    System.out.println("You decide to just head back to the boat that will take you to your homeland.");//end of a story
                  }
                }
              }
              else //go help out
              {
                System.out.println("Needing to get your mind off of the news that you almost died, you decide to be helpful and leave the doctor's office to help set up. You quickly find people who point you to what you can do. Time flies as you help the villagers prepare for this party. You find youself helping carry a large length of wood and are struggling slightly. Roll the die to see what happens. Type 'roll'");
                choice = scan.nextLine();
                if (choice.toLowerCase().equals("roll"))
                {
                  roll = (int)(Math.random()*(50)+0);
                  if (roll >= 25) //carry the wood and set it down no problem
                  {
                    System.out.println(roll + " Congratulations!");
                    System.out.println("You continue carrying the wood with the other person and you are both relieved when you reach where it will go and set it down. You go off the help out somewhere else.");
                    System.out.println(". . .");
                    System.out.println("After a long day of work, you're tired and unsure if you even want to go to the party you spent hours helping set up. Do you stay for the party, or head back to the boat now? (party/boat)");
                    choice = scan.nextLine();
                    if (choice.toLowerCase().equals("party")) //stay for the party
                    {
                      party();
                    }
                    else //head back home
                    {
                      System.out.println("You decide you're too tired to participate in the party. You say goodbye to the villagers and head back to the boat to your homeland, thinking you might like to come back here again someday."); //end of a story
                    }
                  }
                  else //wood falls and you sprain your wrist. back to doctor's
                  {
                    System.out.println(roll + " Unlucky!");
                    System.out.println("On your way to set the wood down, you lose your grip and drop it. You cry out. The person you were carrying the wood with comes over to help. It looks like you've sprained your wrist. Back to the doctor's office you go!");
                    System.out.println(". . .");
                    System.out.println("After the doctor finishes treating you, you head back outside. The party is all set up now, but after such a long day of work, you're tired and unsure if you even want to go to the party you spent hours helping set up. Do you stay for the party, or head back to the boat now? (party/boat)");
                    choice = scan.nextLine();
                    if (choice.toLowerCase().equals("party")) //stay for the party
                    {
                      party();
                    }
                    else //head back home
                    {
                      System.out.println("You decide you're too tired to participate in the party. You say goodbye to the villagers and head back to the boat to your homeland, thinking you might like to come back here again someday."); //end of a story
                    }
                  }
                }
                else //didn't roll. Someone else sees and takes your place
                {
                  System.out.println("One of the villagers notice you're struggling and offer to carry it instead. You gladly take them up on that and go help out with something else.");
                  System.out.println(". . .");
                  System.out.println("After a long days work, you're tired and unsure if you even want to go to the party you spent hours helping set up. Do you stay for the party, or head back to the boat now? (party/boat)");
                  choice = scan.nextLine();
                  if (choice.toLowerCase().equals("party")) //stay for the party
                  {
                    party();
                  }
                  else //head back home
                  {
                    System.out.println("You decide you're too tired to participate in the party. You say goodbye to the villagers and head back to the boat to your homeland, thinking you might like to come back here again someday."); //end of a story
                  }
                }
              }
            }
            else //leave the bite alone
            {
              System.out.println("Since the bite doesn't look too bad, and doesn't hurt anymore, you decide to carry on with your self-guided tour and ignore it. A few minutes later, you start to feel strange. You look down at your arm where the creature bit you, and find an angry red bump the size of a golfball! You panic, thinking you can get to a doctor to help, even as you start to feel lightheaded and lose consciousness. You black out."); //possible death
              System.out.println("Roll the dice to see what happens next! Type 'roll'"); //chance
              choice = scan.nextLine();
              if (choice.toLowerCase().equals("roll"))
              {
                roll = (int)(Math.random()*(50)+0);
                if (roll >= 25)
                {
                  System.out.println(roll + " Congratulations!");
                  System.out.println("You groggly start registering voices as your vision fades back in from black. As the rest of your senses slowly come back, you realize you're laying on sometype of basic medical bed. Someone walks up to you. 'Are you feeling better now?' Yes, you are. You ask what is going on. They found you laying on the jungle floor, dying from a mangoloose bite, so they brought you back to their camp and treated you.");//someone finds them
                  System.out.println("You stay with these people while you recover, learning how they live and all about their culture. Now that you're fully recovered, you have a choice to make. Will you stay with the locals in the jungle, or will you leave and try to find your way out of the jungle to get home? (stay/leave)");
                  choice = scan.nextLine();
                  if (choice.toLowerCase().equals("stay"))//stay with locals
                  {
                    System.out.println("You decide to stay with these strange and welcoming people who nursed you back to health. You completely intergrate into their way of life, living happily in the jungle on this island country."); //end of a story
                  }
                  else //leave the locals
                  {
                    System.out.println("You decide to leave and find your way home. You thank the locals for nursing you back to health and set out on your way. You wander around for a few hours, realizing you have no idea where you are or where to go. Roll the die to see if you will find your way back. Type 'roll'"); 
                    choice = scan.nextLine();
                    if (choice.toLowerCase().equals("roll"))//roll the die
                    {
                      roll = (int)(Math.random()*(50)+0);
                      if (roll >= 25) //found path
                      {
                        System.out.println(roll + " Congratulations!");
                        System.out.println("You stumble upon one of the paths through the jungle and it leads you out. From there you find your way back to the port and board a boat back to your homeland."); //end of a story
                      }
                      else //got lost in jungle
                      {
                        System.out.println(roll + " Unlucky!");
                        System.out.println("You wander around for days, trying to find your way back home. You finally end up dying from the elements and hopelessness that lodged itself in your heart."); //end of a story
                      }
                    }
                    else //won't roll
                    {
                      System.out.println("You give up trying to find your way back, ultimately laying down and dying."); //end of a story
                    }
                  }
                }
                else
                {
                  System.out.println(roll + " Unlucky!");
                  System.out.println("You died on the jungle floor from the creature's bite"); //end of a story
                }
              }
              else
              {
                System.out.println("You gave up your chance and died."); //end of a story
              }
            }
          }
        }
        else //move past lizard
        {
          System.out.println("You move past the lizard, deciding that just looking was enough. Walking along further down the path, you get distracted by a new plant species. It's a little off the path, but you want to go photograph/sketch this plant. Should you stay on the path, or stray? (stay/stray)"); 
          choice = scan.nextLine();
          if (choice.toLowerCase().equals("stay"))//stay on path
          {
            System.out.println("You heed the warning to stay on the path and sketch/photograph the plant from a distance. Once you are done, you continue on your way through the jungle. You emerge to a festival on the other side of the island. Do you want to go home, or stay for the festivities? (home/stay)");
            choice = scan.nextLine();
            if (choice.toLowerCase().equals("home"))//go home
            {
              System.out.println("You are tired from your traverse through the jungle. You decide to take a ride back to the port and board the boat to go back to your homeland immediately."); //end of a story
            }
            else //stay for the party
            {
              party();
            }
          }
          else //check out plant
          {
            System.out.println("You decide to go check out this new plant. You have a grand 'ol time sketching/photographing the plant, but when you turn to go back, you can't see the path anymore. Roll to see what happens next. Type 'roll'");
            choice = scan.nextLine();
            if (choice.toLowerCase().equals("roll"))
            {
              roll = (int)(Math.random()*(50)+0);
              if (roll >= 25) //find path in few steps
              {
                System.out.println(roll + " Congratulations!");
                System.out.println("You stumble around for a few moments, trying to retrace you steps. You luckly find the path not too far away and decide to stay on it through the rest of the jungle. You emerge to a festival on the other side of the island. Do you want to go home, or stay for the festivities? (home/stay)");
                choice = scan.nextLine();
                if (choice.toLowerCase().equals("home"))//go home
                {
                  System.out.println("You are tired from your traverse through the jungle. You decide to take a ride back to the port and board the boat to go back to your homeland immediately."); //end of a story
                }
                else //stay for the party
                {
                  party();
                }
              }
              else //bad roll: get lost and die
              {
                System.out.println(roll + " Unlucky!");
                System.out.println("You stumble around for minutes, which turn into hours, which turn into days. You've lost the path entirely. You end up dying in the wilderness, finally remembering the warning to not stray from the path.");//end of a story
              }
            }
            else //give up on finding path
            {
              System.out.println("You figure it's fine. You stay by the plant and wait for someone to find you and lead you back to the path and out of the jungle. No one does. You die alone, filled with regret about your choices.");//end of a story
            }
          }
        }
      }
      else //coastal tour w/o guide
      {
        System.out.println("You set off towards the coastal paths, excited to see what the sea will hold for you.");
        System.out.println("You soon come across a scenic overlook. Do you want to check it out or continue along the path? (stop/continue)");
        choice = scan.nextLine();
        if (choice.toLowerCase().equals("stop"))//scenic overlook
        {
          System.out.println("You decide you want to stop look over the overlook. You walk onto the floating bridge over the cliffs. The overlook looks like it has been here for a long time. Looking out towards the horizon gives you a beautiful view of the ocean. Over the railing you can see the waves crash against the rocks on either side of a small sand beach. It looks like you might be able to get down to the beach. Do you want to look for a path down or go back to the path you were walking on? (beach/back)");
          choice = scan.nextLine();
          if (choice.toLowerCase().equals("beach")) //look for path to beach
          {
            System.out.println("You want to try to find a path down to the beach. Do you lean over the railing, or start looking around the overlook to find one? (railing/around)");
            choice = scan.nextLine();
            if (choice.toLowerCase().equals("railing")) //lean over railing
            {
              System.out.println("You decide to lean over the railing to see if you can spot a path down to the beach. Roll the die to see if you find a path. Type 'roll'");
              choice = scan.nextLine();
              if (choice.toLowerCase().equals("roll"))
              {
                roll = (int)(Math.random()*(50)+0);
                if (roll >= 25)//spot a path and go follow it
                {
                  System.out.println(roll + " Congratulations!");
                  System.out.println("You spot a path just off to the right of the overlook and work your way towards it."); 
                  beach(); //endings
                }
                else //railing breaks
                {
                  System.out.println(roll + " Unlucky!");
                  System.out.println("As you're leaning over the railing, it breaks and you tumble down to the beach, breaking your neck on the way down.");//end of a story
                }
              }
              else //don't roll
              {
                System.out.println("As you are leaning over the railing, it creaks like it's going to break and you jump back from it. You did, however, spot a path before the railing protested. A little shaken up, you don't know if you still want to go down to the beach. Do you follow the path you saw, or go back to the coastal path you were following? (beach/back)");
                choice = scan.nextLine();
                if (choice.toLowerCase().equals("beach")) //beach
                {
                  System.out.println("You decide you still want to go down to the beach");
                  beach(); //endings
                }
                else //back to coastal path
                {
                  System.out.println("You decide you no longer want to check out the beach. You head back to the path you were on and continue following it.");
                  contCoastalPath(); //endings
                }
              }
            }
            else //around the overlook
            {
              System.out.println("You decide to look around the overlook to see if you can find a path down to the beach. Roll the die to see if you find one. Type 'roll'");
              choice = scan.nextLine();
              if (choice.toLowerCase().equals("roll"))
              {
                roll = (int)(Math.random()*(50)+0);
                if (roll >= 25)//find a path
                {
                  System.out.println(roll + " Congratulations!");
                  System.out.println("You find a good path down just off to the right of the overlook and start making your way down to the beach.");
                  beach(); //endings
                }
                else //didn't find a way to the beach
                {
                  System.out.println(roll + " Unlucky!");
                  System.out.println("After looking all around the overlook, you couldn't find a path down to the beach. Disappointed, you make your way back to the path you were following and continue your way along the coast.");
                  contCoastalPath(); //endings
                }
              }
              else //didn't roll to find a path
              {
                System.out.println("After stepping off the overlook, you realize you don't want to spend the energy searching for a path. You don't want to go to the beach that badly. So you decide to go back to the coastal path that you were following and continue on, skipping the beach."); //give up immediately
                contCoastalPath();//endings
              }
            }
            
          }
          else //back to coastal path
          {
            System.out.println("You decide you don't want to look for a path down to the beach and instead head back to the path you were following.");
            contCoastalPath(); //endings
          }
        }
        else //continue past the overlook
        {
          System.out.println("You decide you don't want to stop for the overlook and continue along the path you are walking on.");
          contCoastalPath(); //endings
        }
      }
    }
    System.out.println("***************");
    System.out.println("This is the end of your adventure. Thank you for playing!");
  } //end of main method
}