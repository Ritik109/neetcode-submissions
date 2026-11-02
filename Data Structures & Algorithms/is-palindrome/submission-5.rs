impl Solution {
    pub fn is_palindrome(s: String) -> bool {
                let arr: Vec<char> = s.to_lowercase()
            .replace(" ","")
            .replace("?","")
            .replace(",","")
            .replace("'","")
            .replace(".","")
            .replace(":","")
            .replace("!","")
            .chars().collect();
        if arr.is_empty() { return true;  }
        let mut start=0;
        let mut end=arr.len()-1;
        while start < end{
            if arr[start]!=arr[end] {
                return false;
            }
            start+=1;
            end-=1;
        }

        true
          
    }
}
