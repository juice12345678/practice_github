function frogPosition(leaves,jumps,start){
    // 関数を完成させてください
    if(start + jumps < 0) end = leaves - Math.abs(start + jumps) % leaves;
    else end = (start + jumps) % leaves;
    return (end == 0)? leaves: end;
}