


EXPECTED_BAKE_TIME =40
PREPARATION_TIME=2

def bake_time_remaining(elapsed_bake_time):
    """EXPECTED_BAKE_TIME - elapsed_bake_time"""
    return EXPECTED_BAKE_TIME - elapsed_bake_time




def preparation_time_in_minutes(number_of_layers):
    """
    This function takes two integers representing the number of lasagna 
    layers and the time already spent baking the lasagna. It calculates 
    the total elapsed minutes spent cooking (preparing + baking).
    
    """

    return number_of_layers * PREPARATION_TIME
    
def elapsed_time_in_minutes(number_of_layers, elapsed_bake_time):
    """ Calculate the elapsed cooking time.
        
        Parameters:
            number_of_layers (int): The number of layers in the lasagna.
            elapsed_bake_time (int): Time the lasagna has been baking in the oven.
        
        Returns:
            int: The total time elapsed (in minutes) preparing and baking.
    """
    return elapsed_bake_time + preparation_time_in_minutes(number_of_layers)


