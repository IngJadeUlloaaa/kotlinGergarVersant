package com.ingjadeulloaaa.gergarversant

class AnswerQuestion {

    object QuestionAnswer {

        val questions = arrayOf(
            "How many students in your class \n __ from korea?",
            "I have seen businesses moving out of the country \n ___ avoid paying taxes.?",
            "We shall take an umbrella with us ____  \n we don't get wet.?",
            "I couldn't drive there ___ so I told my dad to come along.?",
            "Before asking ___ people to share their secrets with you,\n share some of ____ with them.",
            "By the time you ____ to the party, \n we ____ for several hours.",
            "Alan ____ all his money when we got to the casino, \n he didn't even say hi to us",
            "The store ____ by hundreds of people everyday, \n I don't understand why my favorite book ____ yet.",
            "The new movie performed very poorly ____ \n the low ratings it has received by the viewers.",
            "I can see the rainbow clearly now that the rain ____",
            "Several guests complained about ____ cold food last night."
        )

        val choices = arrayOf(
            arrayOf("come", "comes", "are coming", "came"),
            arrayOf("in case", "in view of", "so as to", "although","however"),
            arrayOf("in case", "in order to", "so that", "despite","because of"),
            arrayOf("me", "each other", "myself", "one another's","us"),
            arrayOf("other - yours", "the other - you ", "some others - yours", "others - yours","the others - you"),
            arrayOf("have come - had been drinking", "come - will be drinking", "come - have been drinking", "came - had been drinking","came - were drinking"),
            arrayOf("ought to lose", "should lose", "needn't have lost", "can't have lost","must have lost"),
            arrayOf("visited-hasn't been bought", "is visited-hasn't been bought", "was visited-hadn't bought", "is visited-hadn't been bought","had visited-hasn't been bought"),
            arrayOf("due to", "since", "despite", "however","because"),
            arrayOf("stopped", "had stopped", "stop", "has stopped","will stop"),
            arrayOf("to be served", "being served", "served", "having served","to have been served")
        )

        val correctAnswers = arrayOf(
            "came",
            "so as to",
            "in case",
            "myself",
            "other - yours",
            "come - have been drinking",
            "must have lost",
            "is visited-hasn't been bought",
            "despite",
            "had stopped",
            "being served"
        )
    }
}