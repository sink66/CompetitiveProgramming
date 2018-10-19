<?php
for ($i = 0; $i < 10; $i++) {
    $mountains[] = intval(trim(fgets(STDIN)));
}

rsort($mountains);

for ($i = 0; $i < 3; $i++) {
    echo $mountains[$i] . "\n";
}
