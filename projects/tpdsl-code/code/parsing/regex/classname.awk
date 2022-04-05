/^public\ class/ {print $3} # In "public class foo", foo is 3rd element
/^class/         {print $2} # In "class foo", foo is 2nd element
