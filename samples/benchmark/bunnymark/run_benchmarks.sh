for benchmark_path in benchmarks/*; do
    if [ -d $benchmark_path ]
    then
        benchmark=$(basename $benchmark_path)
        for language_path in $benchmark_path/*; do
			if [ -d $language_path ]
			then
				language=$(basename $language_path)
				echo $benchmark $language
				export/Bunnymark.x86_64 --bench=$benchmark --lang=$language
			fi
        done
    fi
done
