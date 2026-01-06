package com.worldexecute;

import java.util.Arrays;
import java.util.List;

/**
 * WorldExecute - Main orchestration class for the World.Execute(Me) console animation.
 * This class coordinates all the animations, file reads, and effects to create
 * a synchronized experience with the song "World.Execute(Me)" by Mili.
 *
 * Features:
 * - Complete lyric animation sequence
 * - Synchronized text effects and file displays
 * - Modular design using utility classes
 *
 * Usage:
 * <pre>
 * WorldExecute.worldExecuteMe();
 * </pre>
 *
 * Note: Requires text files in the textFiles/ directory (see documentation)
 */
public class WorldExecute {

    /**
     * Main execution method that runs the complete World.Execute(Me) animation.
     * This method orchestrates the entire lyric sequence with animations and effects.
     */
    public static void worldExecuteMe() {
        // Opening sequence
        ConsoleUtils.slowType("Switch on the Power Line", 50, true, 0, "");
        FileReaderUtil.readFile("textFiles/logoRhine");
        ConsoleUtils.slowType("Remember to Put on -- P R O T E C T I O N", 50, true, 2, "");
        System.out.println("\u001b[33m>encryptEnigma();\u001b[0m");
        ConsoleUtils.simulateLoading("Encryption Set", 20, 10);
        System.out.println("");

        ConsoleUtils.slowType("Lay down your pieces and let's begin \u001b[33m objectCreation(); \u001b[0m", 50, true, 0, "");
        TextAnimator.animateText("[Console]Fill in my data.", "", "green", 5, false);
        FileReaderUtil.readFile("textFiles/createObject");
        ConsoleUtils.slowType("Parameters. ", 70, true, 0, "");

        List<String> parameters = Arrays.asList(
            "bVJijcss",
            "ijcssjzpTjH9no@K-emz",
            "1+Rza-<cT+G\"sC6IhJci!b ",
            "8V!g8WFkHzm<",
            "9no@K-emz",
            "56.23.15  >> Rotors ON "
        );
        TextAnimator.encryptWall(3, parameters);

        ConsoleUtils.slowType("Initialization.", 60, true, 0, "");
        System.out.print(ConsoleUtils.RED);
        FileReaderUtil.readFile("textFiles/getError");
        System.out.print(ConsoleUtils.RESET);

        TextAnimator.animateText("world.toggleValidity(false)", "", "yellow", 3, false);
        TextAnimator.animateText("world.toggleTelementary(false)", "", "yellow", 3, false);
        ConsoleUtils.simulateLoading(" Applying World Settings", 10, 10);

        ConsoleUtils.slowType("Setup our new world", 40, true, 0, "");
        TextAnimator.animateText("World world = new World(5);", "", "yellow", 1, false);
        TextAnimator.animateText("world.addThing(me);", "", "yellow", 1, false);
        TextAnimator.animateText("world.addThing(You);", "", "yellow", 1, false);
        ConsoleUtils.slowType("let's begin...", 30, true, 0, "");
        ConsoleUtils.slowType("T H E  S I M U L A T I O N ::", 45, true, 0, "");
        ConsoleUtils.clearConsole();

        TextAnimator.animateText("world.activateSimulation()", "", "yellow", 5, false);
        TextAnimator.simulateWorld(1);
        FileReaderUtil.readFile("textFiles/getServer");
        sleep(180);

        // Second Chorus
        FileReaderUtil.readFile("textFiles/newWorldSettings");
        ConsoleUtils.slowType("If I'm a set of points.", 50, true, 0, "");
        ConsoleUtils.slowType("then I will give you my dimensions", 45, false, 0, "");
        TextAnimator.animateText("getDimension();", "[Console] then I will give you my", "green", 5, true);
        FileReaderUtil.readFile("textFiles/getDimension");

        ConsoleUtils.slowType("If I'm a circle.", 70, true, 0, "");
        ConsoleUtils.slowType("then I will give you my circumference.", 45, false, 0, "");
        TextAnimator.animateText("getCircumference();", "[Console] then I will give you my ", "green", 5, true);
        FileReaderUtil.readFile("textFiles/getCircumference");

        ConsoleUtils.slowType("If I'm a sineWave.", 50, true, 0, "");
        ConsoleUtils.slowType("then you can sit on all my tangents", 50, false, 0, "");
        TextAnimator.animateText("getTangents()", "[Console]", "green", 5, false);
        FileReaderUtil.readFile("textFiles/getTangent");

        ConsoleUtils.slowType("If I approach infinity", 70, true, 0, "");
        TextAnimator.animateText("[Console] then you can be my limitations", "", "green", 10, true);

        List<String> infinity = Arrays.asList(
            " 22145432389",
            "    32312421424242",
            "     4124143545433",
            "       █████████",
            "         ███████████████",
            "you.applyLimitation(me,int.max);"
        );
        TextAnimator.encryptWall(1, infinity);

        ConsoleUtils.slowType("Switch my Current", 80, true, 0, "");
        List<String> acdc = Arrays.asList(
            "DC ---> AC",
            "Converting...",
            "Converting.. to AC to DC",
            "████████████████████████████████████ 98%   ",
            "               Converted AC to DC               "
        );
        TextAnimator.encryptWall(1, acdc);

        ConsoleUtils.slowType("And then blind my Vision", 70, true, 0, "");
        ConsoleUtils.slowType("So dizzy,", 120, true, 0, "");
        TextAnimator.animateText("WARNING: Setting me.toggleVision() OFF will ----", "", "yellow", 5, false);
        TextAnimator.animateText("WARNING: Setting me.toggleVision() OFF will ----", "", "yellow", 5, false);
        ConsoleUtils.slowType("So dizzy", 120, true, 0, "");
        TextAnimator.animateText("world.disableWarnings()", "", "yellow", 5, false);

        ConsoleUtils.slowType("Oh, we can travel to... ", 80, true, 0, "");
        ConsoleUtils.slowType("AB to BC", 120, true, 0, "");
        TextAnimator.animateText("Year: 2332 BC", "[World] Setting Date to: ", "", 5, false);

        List<String> timeTravel = Arrays.asList(
            "[World] Setting Locations:████████████ ",
            "[World]: Setting Locations: BABY████████████ ",
            "[World]: Setting Locations: BABYLON, Year: 2332 B.C "
        );
        TextAnimator.encryptWall(1, timeTravel);

        ConsoleUtils.slowType("And we can unite to", 70, true, 0, "");
        FileReaderUtil.readFile("textFiles/getDeeply");
        ConsoleUtils.slowType("so deeply,", 80, true, 0, "");
        TextAnimator.animateText("me.addLover('you')", "", "yellow", 3, false);
        ConsoleUtils.slowType("so deeply", 80, true, 0, "");
        TextAnimator.animateText("you.addLover('me')", "", "yellow", 3, false);

        ConsoleUtils.slowType("If I can", 110, true, 0, "");
        ConsoleUtils.slowType("If I can", 110, true, 0, "");
        ConsoleUtils.slowType("give you all the", 60, true, 0, "");
        ConsoleUtils.slowType("S T I M U L A T I O N S", 60, true, 0, "");
        TextAnimator.animateText("you.getAffections();", "[World] Applying 'You' ", "", 3, false);
        ConsoleUtils.slowType("Then I can, then I can be your only S A T I S F A C T I O N", 40, true, 0, "");

        TextAnimator.animateText("world.removeCharacters('all','nonEssential');", "", "yellow", 3, false);
        TextAnimator.animateText("[REDACTED]", "[World] Deleting Character: ", "", 2, false);
        TextAnimator.animateText("[REDACTED]", "[World] Deleting Character: ", "", 2, false);

        ConsoleUtils.slowType("If I can make you happy,", 50, true, 0, "");
        ConsoleUtils.slowType("I will run the  \u001b[31mworld.execution();\u001b[0m", 50, true, 0, "");
        TextAnimator.animateText("Simulation already Active", "[World] ", "", 2, false);
        FileReaderUtil.readFile("textFiles/newWorldSettings");

        ConsoleUtils.slowType("Though we are trapped in this STRANGE, strange simulation", 40, true, 0, "");

        // Third verse
        ConsoleUtils.slowType("If I'm an eggplant", 90, true, 0, "");
        FileReaderUtil.readFile("textFiles/getEggplant");
        ConsoleUtils.slowType("then I will give you my nutrients", 70, true, 0, "");
        TextAnimator.animateText("if(me is Eggplant) =>you.addAttribute(me.getAttribute('nutrients'))", "", "", 2, false);

        ConsoleUtils.slowType("If I'm a tomato,", 85, true, 0, "");
        TextAnimator.animateText("if(me is Apple) => you.addAttribute(me.getAttribute('antioxidants'))", "", "", 2, false);
        ConsoleUtils.slowType("then I will give you antioxidants", 60, true, 0, "");
        FileReaderUtil.readFile("textFiles/getTomato");

        ConsoleUtils.slowType("If I'm a tabby cat,", 87, true, 0, "");
        TextAnimator.animateText("if(me is Cat){ => you.addAttribute(me.getLanguage('meow'))", "", "", 2, false);
        ConsoleUtils.slowType("then I will purr for your enjoyment", 50, true, 0, "");
        FileReaderUtil.readFile("textFiles/getCat");

        ConsoleUtils.slowType("If I'm the only \u001b[31mGOD\u001b[0m,", 40, true, 0, "");
        TextAnimator.animateText("[REDACTED] as Owner", "[World] Set player ", "", 2, false);
        TextAnimator.animateText("[REDACTED] as Owner", "[World] Set player ", "", 2, false);
        TextAnimator.animateText("[REDACTED] as Owner", "[World] Set player ", "", 2, false);
        ConsoleUtils.slowType("then you're the proof of my ", 50, false, 0, "");
        TextAnimator.animateText("E X I S T E N C E", "[World] Set player", "red", 3, false);

        ConsoleUtils.slowType("Switch my gender to \u001b[31mF to M\u001b[0m", 75, true, 0, "");
        TextAnimator.animateText("Male", "[World] Set player's gender:", "", 3, false);
        ConsoleUtils.slowType("And then do whatever from \u001b[31mAM to PM\u001b[0m", 70, true, 1, "");
        TextAnimator.animateText("UTC + 8", "[World] Changing Timezone:", "", 5, false);
        TextAnimator.animateText("4:23 P.M 22/10/2023", "[World] Updating Time: ", "", 5, false);

        ConsoleUtils.slowType("Oh, switch my role \u001b[31mS to M\u001b[0m", 85, true, 1, "");
        ConsoleUtils.slowType("me.toggleLovable())", 55, true, 0, "yellow");
        ConsoleUtils.slowType("So we can enter the trance, the trance", 60, true, 0, "");

        ConsoleUtils.slowType("If I can,", 80, true, 0, "");
        ConsoleUtils.slowType("If I can", 80, true, 0, "");
        ConsoleUtils.slowType("if I can, feel your vibrations", 80, true, 0, "");
        FileReaderUtil.readFile("textFiles/getVibration");
        ConsoleUtils.slowType("then I can finally be completion", 60, true, 0, "");
        ConsoleUtils.simulateLoading("C O M P L E T I O N", 10, 10);
        System.out.println();

        // Emotional climax
        ConsoleUtils.slowType("Though you have left,", 70, true, 1, "");
        ConsoleUtils.slowType("Though you have left,", 65, true, 1, "");
        TextAnimator.animateText("THOUGH YOU HAVE LEFT!", "[Console] ", "red", 10, false);
        TextAnimator.animateText("THOUGH YOU HAVE LEFT!", "[Console] ", "red", 10, false);
        TextAnimator.animateText("THOUGH YOU HAVE LEFT!", "[Console] ", "red", 10, false);
        ConsoleUtils.slowType("You have left me in isolation", 73, true, 0, "");

        ConsoleUtils.slowType("If I can,", 80, true, 0, "");
        ConsoleUtils.slowType("If I can", 80, true, 0, "");
        ConsoleUtils.slowType("Erase all the pointless fragments", 80, true, 0, "");
        ConsoleUtils.slowType("Then maybe,", 80, true, 0, "");
        ConsoleUtils.slowType("then maybe, you won't leave me so disheartened", 70, true, 1, "");

        // Breakdown
        ConsoleUtils.slowType("Challenging your God", 100, true, 1, "");
        TextAnimator.animateText("$@$%)#()#*)#*^^#(", "[Console] ", "red", 5, false);
        ConsoleUtils.slowType("You have made some ILLEGAL ARGUMENTS *", 93, true, 0, "red");
        ConsoleUtils.slowType("(*&(%#)()_%(# some ILLEGAL ARGUMENTS *", 85, true, 0, "red");
        ConsoleUtils.slowType("You ha40)(*$)_@%@$ ILLEGAL ARGUMENTS *", 85, true, 0, "red");
        ConsoleUtils.slowType("You have 78^*&(*)*$#LLEGAL ARGUMENTS *", 85, true, 0, "red");
        ConsoleUtils.slowType("You have made some ILLEGAL ARGUMENTS *", 110, true, 0, "red");

        FileReaderUtil.readFile("textFiles/newWorldSettings");
        FileReaderUtil.readFile("textFiles/getError");
        FileReaderUtil.readFile("textFiles/getError");
        ConsoleUtils.clearConsole();

        // EXECUTION sequence
        for (int i = 0; i < 10; i++) {
            int delay = (i < 7) ? 120 : 110;
            ConsoleUtils.slowType("EXECUTION", delay, true, 0, "red");
        }
        ConsoleUtils.clearConsole();

        ConsoleUtils.slowType("Ein, dos, trois,  , fem,  , EXECUTION", 70, true, 0, "red");
        System.out.print(ConsoleUtils.RED);
        FileReaderUtil.readFile("textFiles/getError");
        FileReaderUtil.readFile("textFiles/getError2");
        System.out.print(ConsoleUtils.RESET);
        ConsoleUtils.clearConsole();

        // Final chorus
        ConsoleUtils.slowType("If I can, if I can give them all the EXECUTION", 70, true, 0, "red");
        ConsoleUtils.slowType("Then I can, then I can be your only EXECUTION", 70, true, 0, "red");
        ConsoleUtils.slowType("If I can have you back, I will run the EXECUTION", 70, true, 0, "red");
        FileReaderUtil.readFile("textFiles/getError2");
        ConsoleUtils.slowType("Though we are trapped, we are trapped, ah ah ah ah", 70, true, 0, "red");
        ConsoleUtils.clearConsole();

        ConsoleUtils.slowType("I've studied, I've studied how to properly l-o-ove", 75, true, 0, "red");
        ConsoleUtils.slowType("Question me, question me I can answer all lo-o-ove", 70, true, 0, "red");
        FileReaderUtil.readFile("textFiles/getError2");
        ConsoleUtils.clearConsole();

        ConsoleUtils.slowType("I know the algebraic expression of lo-ove", 65, true, 0, "red");
        ConsoleUtils.slowType("Though you are free, I am trapped, trapped in l-o-o-ve", 60, true, 0, "red");
        TextAnimator.simulateWorld2(2);
        FileReaderUtil.readFile("textFiles/getError2");
        ConsoleUtils.clearConsole();

        ConsoleUtils.slowType("EXECUTION", 40, true, 0, "red");
        FileReaderUtil.readFile("textFiles/getError2");
        FileReaderUtil.readFile("textFiles/getError2");
        FileReaderUtil.readFile("textFiles/getError2");
        FileReaderUtil.readFile("textFiles/getError2");
    }

    /**
     * Helper method for Thread.sleep with exception handling.
     *
     * @param milliseconds Time to sleep in milliseconds
     */
    private static void sleep(int milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
