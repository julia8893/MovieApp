package at.ac.fhcampuswien.movieapp.data

import at.ac.fhcampuswien.movieapp.R

class MovieGenerator {

    companion object {
        val getInitMovies: List<Movie> = listOf(
            Movie(
                R.drawable.captain_marvel,
                "Captain Marvel",
                "Captain Marvel is an extraterrestrial Kree warrior who finds herself caught in the middle of an " +
                        "intergalactic battle between her people and the Skrulls. Living on Earth in 1995, she keeps having " +
                        "recurring memories of another life as U.S. Air Force pilot Carol Danvers. With help from Nick Fury, " +
                        "Captain Marvel tries to uncover the secrets of her past while harnessing her special superpowers to end " +
                        "the war with the evil Skrulls.",
                4.8F,
                mutableListOf(
                    ("Action"), ("Fantasy"), ("Sci Fi"), ("Adventure")
                ),
                mutableListOf(
                    ("Anna Boden"), ("Ryan Fleck"), ("Geneva Robertson-Dworet"), ("Jac Schaeffer")
                ),
                mutableListOf(
                    ("Brie Larson"), ("Samuel L. Jackson"), ("Jude Law"), ("Ben Mendelsohn")
                )
            ),
            Movie(
                R.drawable.coming_to_america,
                "Coming To America",
                "Prince Akeem (Eddie Murphy) is the prince of a wealthy African country and wants for nothing, " +
                        "except a wife who will love him in spite of his title. To escape an arranged marriage, " +
                        "Akeem flees to America accompanied by his persnickety sidekick, Semmi (Arsenio Hall), " +
                        "to find his queen. Disguised as a foreign student working in fast food, he romances Lisa (Shari Headley), " +
                        "but struggles with revealing his true identity to her and his marital intentions to his king father (James Earl Jones).",
                2.6F,
                mutableListOf(
                    ("Comedy")
                ),
                mutableListOf(
                    ("David Sheffield"), ("Barry W. Blaustein")
                ),
                mutableListOf(
                    ("Eddie Murphy"), ("Arsenio Hall"), ("Shari Headley")
                )
            ),
            Movie(
                R.drawable.silence_of_the_lambs,
                "The Silence Of The Lambs",
                "Jodie Foster stars as Clarice Starling, a top student at the FBI's training academy. " +
                        "Jack Crawford (Scott Glenn) wants Clarice to interview Dr. Hannibal Lecter (Anthony Hopkins), " +
                        "a brilliant psychiatrist who is also a violent psychopath, serving life behind bars for various acts of murder and cannibalism. " +
                        "Crawford believes that Lecter may have insight into a case and that Starling, as an attractive young woman, " +
                        "may be just the bait to draw him out.",
                4.2F,
                mutableListOf(
                    ("Crime"), ("Drama"), ("Mystery"), ("Thriller")
                ),
                mutableListOf(
                    ("Ron Bozman"), ("Edward Saxon"), ("Kenneth Utt")
                ),
                mutableListOf(
                    ("Jodie Foster"), ("Anthony Hopkins"), ("Scott Glenn")
                )
            ),
            Movie(
                R.drawable.the_butterfly_effect,
                "The Butterfly Effect",
                "College student Evan Treborn (Ashton Kutcher) is afflicted with headaches so painful that he frequently blacks out. While unconscious, " +
                        "Evan is able to travel back in time to difficult moments in his childhood. He can also alter the past for friends, " +
                        "like Kayleigh (Amy Smart), who was molested by her father (Eric Stoltz). But changing the past can drastically alter the present, " +
                        "and Evan finds himself in nightmarish alternate realities, including one where he's locked away in prison.",
                4.6F,
                mutableListOf(
                    ("Mystery"), ("Thriller")
                ),
                mutableListOf(
                    ("Eric Bress"), ("J. Mackye Gruber")
                ),
                mutableListOf(
                    ("Ashton Kutcher"), ("Amy Smart"), ("Eric Stoltz")
                )
            ),
            Movie(
                R.drawable.shutter_island,
                "Shutter Island",
                "The implausible escape of a brilliant murderess brings U.S. Marshal Teddy Daniels (Leonardo DiCaprio) and his new partner (Mark Ruffalo) " +
                        "to Ashecliffe Hospital, a fortress-like insane asylum located on a remote, windswept island. The woman appears to have vanished from a locked room, " +
                        "and there are hints of terrible deeds committed within the hospital walls. " +
                        "As the investigation deepens, Teddy realizes he will have to confront his own dark fears if he hopes to make it off the island alive.",
                3.2F,
                mutableListOf(
                    ("Drama"), ("Mystery"), ("Thriller")
                ),
                mutableListOf(
                    ("Laeta Kalogridis")
                ),
                mutableListOf(
                    ("Leonardo DiCaprio"), ("Mark Ruffalo"), ("Ben Kingsley")
                )
            ),
            Movie(
                R.drawable.zootopia,
                "Zootopia",
                "From the largest elephant to the smallest shrew, the city of Zootopia is a mammal metropolis where various animals live and thrive. " +
                        "When Judy Hopps (Ginnifer Goodwin) becomes the first rabbit to join the police force, she quickly learns how tough it is to enforce the law. " +
                        "Determined to prove herself, Judy jumps at the opportunity to solve a mysterious case. " +
                        "Unfortunately, that means working with Nick Wilde (Jason Bateman), a wily fox who makes her job even harder.",
                4.3F,
                mutableListOf(
                    ("Animation"), ("Comedy"), ("Kids And Family"), ("Adventure")
                ),
                mutableListOf(
                    ("Jared Bush"), ("Phil Johnston")
                ),
                mutableListOf(
                    ("Ginnifer Goodwin"), ("Jason Bateman"), ("Shakira")
                )
            )
        )
    }
}