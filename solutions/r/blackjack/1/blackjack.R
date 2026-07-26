library(dplyr)

parse_card <- function(card) {
 #  to_number(card)
number_words <- c("one", "two", "three", "four", "five", "six", "seven","eight","nine")
if(card %in% number_words) { match(card, number_words)}
else{
  recode_values(
    card,
   "ace" ~ 11,
   c("jack","queen","king","ten") ~ 10,
  default = 0
    
  )}
  
  
}

first_turn <- function(card1, card2, dealer_card) {
case_when(
  parse_card(card1)+ parse_card(card2)==22 ~ "P",
  parse_card(card1)+ parse_card(card2)==21 && !parse_card(dealer_card)>=10 ~"W",
  parse_card(card1)+ parse_card(card2)==21 && parse_card(dealer_card)>=10 | between(parse_card(card1)+ parse_card(card2), 17, 20)| between(parse_card(card1)+ parse_card(card2), 12, 16)&&parse_card(dealer_card)<7 ~"S",
.default="H"
  
)
}
