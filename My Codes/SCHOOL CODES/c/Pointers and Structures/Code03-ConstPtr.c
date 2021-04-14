/****************************************************************
 * Attempting to modify a constant pointer to
 * non-constant data
 ***************************************************************/
#include <stdio.h>

int main()
{
    int x;
    int y;
    int* const ptr = &x;
    /*******************************************************
     * ptr is a constant pointer to an integer.
     * An integer can be modified through ptr,
     * but ptr always points to the same memory location.
     *******************************************************/
     *ptr = 7;
     ptr = &y;

    return 0;
}
