package arshsingh93.funfacts;

import java.util.Random;

/**
 * Created by Student on 6/29/2015.
 */
public class FactBook {

    //Member variables (properties about the object)
    private String[] myGuruFacts = {
            "Guru Nanak Dev Ji was the first Guru of the Sikhs",
            "Guru Nanak Dev Ji traveled extensively throughout India and foreign lands",
            "The Gurmukhi script was introduced by Guru Angad Dev Ji",
            "Guru Amar Das Ji preached against the practice of 'sati' (the burning of the wife at her husband's funeral)",
            "The city of Amritsar was founded by Guru Ram Das Ji in 1574",
            "Guru Ram Das Ji composed the hymn for the Anand Karaj (marriage ceremony)",
            "Guru Arjan Dev Ji had Harmandir Sahib (Golden Temple) built",
            "Mughal Emperor Jahangir imprisoned Guru Arjan Dev Ji for not altering the writing of the Adi Granth",
            "Guru Arjan Dev Ji was the first Sikh Guru to be martyred",
            "The Akal Takht was built in 1608 in Amritsar by Guru Hargobind Ji",
            "Martial arts and weaponry were introduced for the masses by Guru Hargobind Ji ",
            "Bandi Chor Divas is celebrated to mark the release of Guru Hargobind Ji and 52 Rajputs",
            "Guru Har Rai Ji made his 5 year old son the next Guru",
            "Guru Harkrishan Ji cured the ill during a smallpox epidemic in Delhi",
            "Guru Harkrishan Ji became the youngest Guru at the age of five",
            "Guru Tegh Bahadur Ji sacrificed their life to uphold the 'right to freedom of religion'",
            "The last names Singh and Kaur were given by Guru Gobind Singh Ji",
            "All four of Guru Gobind Singh's sons were martyred by the Mughals",
            "The tenth Guru ordered the Sikhs to follow Guru Granth Sahib as the eleventh and final Guru",
            "The final Guru of the Sikhs is Guru Granth Sahib Ji"};

    private String[] myBefore84Facts = {
            "Indira Gandhi imposed an internal emergency on the whole of India on the grounds of 'internal disturbance'",
            "In June of 1975, the Allahabad High Court ruled that Indira Gandhi's election to Parliament was null and void",
            "Indira Gandhi passed Amendment 39 of 1975 which allowed an Indian Prime Minister to ignore the courts",
            "As a result of the internal emergency imposed by Indira Gandhi, thousands of politicians and journalists were imprisoned",
            "Protests were strictly contained during the internal emergency of 1975-1977",
            "Indira Gandhi imposed censorship on newspapers which meant that no one was allowed to write against the government",
            "Indira Gandhi reduced the power of the Supreme Court by passing Amendment 42",
            "Indira Gandhi dismissed several state governments, including Punjab's, because they were not loyal to her",
            "Under the internal emergency, Indira Gandhi's government forcefully sterilized many woman",
            "An estimated 40 thousand Sikhs were arrested for holding large protests against Indira Gandhi's abuse of power",
            "The internal emergency on India lasted 21 months from 1975 til 1977",
            "The Congress Party and Indira Gandhi lost power after the elections of March 1977 when the BJP became the majority",
            "In 1980, Indira Gandhi was voted back into office",
            "A replica of the Golden Temple was built so that the Indian Army could prepare for its attack in Amritsar"
            //Also insert some facts about Sikhs demanding rights.
    };


    private String[] myBattle84Facts = {
            "Indira Gandhi ordered the attack on the Sikhs in Amritsar",
            "The Akal Takht and several other buildings were damaged",
    };

    private String[] myAfter84Facts = {
            "Indira Gandhi was shot and killed a few months after her attack on the Sikhs",
            "Satwant Singh and Beant Singh dropped their weapons and surrendered after shooting Indira Gandhi",
    };

    //Method (abilities: things the object can do)
    public String getFact(String theBook) {
        String fact = "";

        //Randomly select a fact
        Random randomGenerator = new Random(); //Construct a new Random # generator

        if (theBook.equals("Guru Facts")) {
            int randomNumber = randomGenerator.nextInt(myGuruFacts.length);
            fact = myGuruFacts[randomNumber];
        } else if (theBook.equals("Before 84 Facts")) {
            int randomNumber = randomGenerator.nextInt(myBefore84Facts.length);
            fact = myBefore84Facts[randomNumber];
        } else if (theBook.equals("Battle of 84 Facts")) {
            int randomNumber = randomGenerator.nextInt(myBattle84Facts.length);
            fact = myBattle84Facts[randomNumber];
        } else if (theBook.equals("After 84 Facts")) {
            int randomNumber = randomGenerator.nextInt(myAfter84Facts.length);
            fact = myAfter84Facts[randomNumber];
        }

        return fact;
    }
}
