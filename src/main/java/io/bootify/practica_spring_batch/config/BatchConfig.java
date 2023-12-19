package io.bootify.practica_spring_batch.config;
/*
import io.bootify.practica_spring_batch.model.TransaccionesDTO;
import io.bootify.practica_spring_batch.domain.Transacciones;
import io.bootify.practica_spring_batch.repos.TransaccionesRepository;
import lombok.AllArgsConstructor;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.job.builder.JobBuilder;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.batch.core.repository.JobRepository;
import org.springframework.batch.core.repository.support.JobRepositoryFactoryBean;
import org.springframework.batch.core.step.builder.StepBuilder;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.batch.item.data.RepositoryItemWriter;
import org.springframework.batch.item.file.LineMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.batch.item.file.mapping.BeanWrapperFieldSetMapper;
import org.springframework.batch.item.file.mapping.DefaultLineMapper;
import org.springframework.batch.item.file.transform.DelimitedLineTokenizer;

import javax.sql.DataSource;
import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.ItemWriter;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.task.SimpleAsyncTaskExecutor;
import org.springframework.core.task.TaskExecutor;
import org.springframework.transaction.PlatformTransactionManager;


@Configuration
@EnableBatchProcessing
@AllArgsConstructor
public class BatchConfig {

    @Autowired
    private JobRepository jobRepository;

    @Autowired
    private PlatformTransactionManager transactionManager;

    private TransaccionesRepository transaccionesRepository;


    @Bean
    public FlatFileItemReader<Transacciones> reader() {
        FlatFileItemReader<Transacciones> itemReader = new FlatFileItemReader<>();
        itemReader.setResource(new FileSystemResource("src/main/resources/transacciones.csv"));
        itemReader.setName("csvReader");
        itemReader.setLinesToSkip(1);
        itemReader.setLineMapper(lineMapper());
        return itemReader;
    }

    private LineMapper<Transacciones> lineMapper() {
        DefaultLineMapper<Transacciones> lineMapper = new DefaultLineMapper<>();

        DelimitedLineTokenizer lineTokenizer = new DelimitedLineTokenizer();
        lineTokenizer.setDelimiter(",");
        lineTokenizer.setStrict(false);
        lineTokenizer.setNames("id","fecha","cantidad","tipotrans","cuentaorigen","cuentadestino","dateCreated","lastUpdated");

        BeanWrapperFieldSetMapper<Transacciones> fieldSetMapper = new BeanWrapperFieldSetMapper<>();
        fieldSetMapper.setTargetType(Transacciones.class);

        lineMapper.setLineTokenizer(lineTokenizer);
        lineMapper.setFieldSetMapper(fieldSetMapper);
        return lineMapper;

    }


    @Bean
    public TransaccionesProcessor processor() {
        return new TransaccionesProcessor();
    }

    @Bean
    public RepositoryItemWriter<Transacciones> writer() {
        RepositoryItemWriter<Transacciones> writer = new RepositoryItemWriter<>();
        writer.setRepository(transaccionesRepository);
        writer.setMethodName("save");
        return writer;
    }


    @Bean
    public Step step(ItemReader<Transacciones> reader, ItemProcessor<Transacciones, Transacciones> processor, ItemWriter<Transacciones> writer) {
        return new StepBuilder("csv-step", jobRepository)
                .<Transacciones, Transacciones>chunk(10, transactionManager)
                .reader(reader)
                .processor(processor)
                .writer(writer)
                .taskExecutor(taskExecutor())
                .build();
    }


    @Bean
    public Job runJob(Step step) {
        return new JobBuilder("import-transacciones", jobRepository)
                .start(step)
                .build();
    }

    @Bean
    public TaskExecutor taskExecutor() {
        SimpleAsyncTaskExecutor asyncTaskExecutor = new SimpleAsyncTaskExecutor();
        asyncTaskExecutor.setConcurrencyLimit(10);
        return asyncTaskExecutor;
    }
}


*/

