/*
Because we can both grab the remainer of %10 (last digit) and store the new value of n each iteration with division,
we can simply iterate on n until 0, updating result constantly rather than storing digits

*/
class Solution {
  public int subtractProductAndSum(int n) {
    int sum = 0,
    product = 1;
    while (n > 0) {
      sum += n % 10;
      product *= n % 10;
      n /= 10;
    }
    return product - sum;
  }

}