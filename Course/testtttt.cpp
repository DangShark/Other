#include <iostream>
#include <stack>
#include <string>

using namespace std;

bool isValid(const string &s) {
    stack<char> st;
    for (char c : s) {
        if (c == '(' || c == '[' || c == '{') {
            st.push(c);
        } else {
            if (st.empty()) return false;
            if ((c == ')' && st.top() != '(') ||
                (c == ']' && st.top() != '[') ||
                (c == '}' && st.top() != '{')) {
                return false;
            }
            st.pop();
        }
    }
    return st.empty();
}

int main() {
    int T;
    cin >> T;
    cin.ignore();
    for (int i = 0; i < T; ++i) {
        string s;
        getline(cin, s);
        if (isValid(s)) {
            cout << "yes\n";
        } else {
            cout << "no\n";
        }
    }
    return 0;
}

