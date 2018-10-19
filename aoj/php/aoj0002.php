<?php
// $input = explode(' ', trim(fgets(STDIN)));
while (list($a, $b) = fscanf(STDIN, "%d %d")) {
    echo strlen(strval($a + $b)), PHP_EOL;
}
//while(!feof(STDIN)){
