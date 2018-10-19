<?php

$N = intval(trim(fgets(STDIN)));

for ($i = 0; $i < $N; $i++) {
    $input = explode(' ', trim(fgets(STDIN)));
    if (($input[0] * $input[0]) + ($input[1] * $input[1]) == $input[2] * $input[2]
        || ($input[0] * $input[0]) + ($input[2] * $input[2]) == $input[1] * $input[1]
        || ($input[1] * $input[1]) + ($input[2] * $input[2]) == $input[0] * $input[0]) {
        echo "YES" . PHP_EOL;
    } else {
        echo "NO" . PHP_EOL;
    }
}
