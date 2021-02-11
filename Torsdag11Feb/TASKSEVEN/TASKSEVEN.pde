//TASK 7


//7a and b
int input = -20;

if (input > 0){
for (int i = 1; i < input; i++) {
  if (i == input/2) {
    println("HALF");
  } else if (i == 6) {
    println("SIX");
  } else {
    println(i);
  }
}
} else {
  for (int i = -1; i > input; i--) {
  if (i == input/2) {
    println("HALF");
  } else if (i == 6) {
    println("SIX");
  } else {
    println(i);
  }
}
}
